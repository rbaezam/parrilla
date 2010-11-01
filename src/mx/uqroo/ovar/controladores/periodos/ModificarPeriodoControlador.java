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
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 24/10/2010
 * Hora: 03:18:51 PM
 */
@Controller
@RequestMapping("/catalogos/periodos/modificar")
public class ModificarPeriodoControlador {

	@Autowired
	private PeriodoServicio periodoServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@RequestParam(required = true, value = "id") Long id, Model modelo) {
		Periodo periodo = periodoServicio.obtenerPorId(id);
		modelo.addAttribute("titulo", "Modificar periodo");
		modelo.addAttribute("periodo", periodo);

		return "periodos/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute Periodo periodo, BindingResult resultado) {
		periodoServicio.guardar(periodo);

		return "redirect:listado.form";
	}
}
