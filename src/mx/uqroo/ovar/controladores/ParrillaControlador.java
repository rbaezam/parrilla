package mx.uqroo.ovar.controladores;

import mx.uqroo.ovar.dominio.Objetivo;
import mx.uqroo.ovar.dominio.Parrilla;
import mx.uqroo.ovar.dominio.ParrillaEditor;
import mx.uqroo.ovar.servicios.ObjetivoServicio;
import mx.uqroo.ovar.servicios.ParrillaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 29/10/2010
 * Hora: 08:34:10 PM
 */
@Controller
@RequestMapping("/parrilla")
public class ParrillaControlador {

	@Autowired
	private ParrillaServicio parrillaServicio;

	@Autowired
	private ObjetivoServicio objetivoServicio;

	@ModelAttribute("parrillas")
	public List<Parrilla> llenarComboParrillas() {
		return parrillaServicio.obtenerTodos();
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Parrilla.class, new ParrillaEditor(parrillaServicio));
	}

	@RequestMapping(method = RequestMethod.GET)
	public String parrilla(@RequestParam(required = false, value = "idParrilla") Long idParrilla,
	                    Model modelo) {

		if(idParrilla != null) {
			Parrilla parrilla = parrillaServicio.obtenerPorId(idParrilla);
			modelo.addAttribute("parrilla", parrilla);
			//modelo.addAttribute("objetivos", parrilla.getObjetivos());
		}

		return "parrilla";
	}

	@RequestMapping(value = "/agregarObjetivo", method = RequestMethod.GET)
	public @ResponseBody Map agregarObjetivo(@RequestParam String nombreObjetivo,
	                                      @RequestParam Long idParrilla) {
		Parrilla parrilla = parrillaServicio.obtenerPorId(idParrilla);

		Objetivo objetivo = new Objetivo();
		objetivo.setNombre(nombreObjetivo);
		objetivo.setParrilla(parrilla);

		objetivoServicio.guardar(objetivo);
		Map<String, Object> mapaModelo = new HashMap<String, Object>(3);
		mapaModelo.put("total", 1);
		mapaModelo.put("datos", objetivo);
		mapaModelo.put("exito", true);

		return mapaModelo;
	}
}
