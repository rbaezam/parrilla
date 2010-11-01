package mx.uqroo.ovar.controladores.periodos;

import mx.uqroo.ovar.dominio.Periodo;
import mx.uqroo.ovar.servicios.PeriodoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 03:23:31 PM
 */

@Controller
@RequestMapping("/catalogos/periodos/agregar")
public class AgregarPeriodoControlador {

	@Autowired
	private PeriodoServicio periodoServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model modelo) {
		Periodo periodo = new Periodo();

		modelo.addAttribute("titulo", "Agregar periodo");
		modelo.addAttribute("periodo", periodo);

		return "periodos/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute Periodo periodo, BindingResult resultado) {
		periodoServicio.guardar(periodo);

		return "redirect:listado.form";
	}
}
