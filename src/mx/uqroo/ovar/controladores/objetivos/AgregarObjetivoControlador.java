package mx.uqroo.ovar.controladores.objetivos;

import mx.uqroo.ovar.dominio.Objetivo;
import mx.uqroo.ovar.dominio.Parrilla;
import mx.uqroo.ovar.servicios.ObjetivoServicio;
import mx.uqroo.ovar.servicios.ParrillaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 11/11/2010
 * Hora: 02:49:15 PM
 */
@Controller
@RequestMapping("/parrilla/objetivos/agregar")
public class AgregarObjetivoControlador {

	@Autowired
	private ObjetivoServicio objetivoServicio;

	@Autowired
	private ParrillaServicio parrillaServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@RequestParam("idParrilla") Long idParrilla, Model modelo) {

		if(idParrilla == null) {
			return "redirect:/parrilla.form";
		}

		Objetivo objetivo = new Objetivo();
		Parrilla parrilla = parrillaServicio.obtenerPorId(idParrilla); 
		objetivo.setParrilla(parrilla);

		modelo.addAttribute("titulo", "Agregar objetivo");
		modelo.addAttribute("objetivo", objetivo);
		modelo.addAttribute("idParrilla", idParrilla);

		return "objetivos/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@RequestParam("idParrilla") Long idParrilla, @ModelAttribute Objetivo objetivo, 
	                      BindingResult res) {

		Parrilla parrilla = parrillaServicio.obtenerPorId(idParrilla);
		objetivo.setParrilla(parrilla);
		objetivoServicio.guardar(objetivo);

		return "redirect:/parrilla.form";
	}
}
