package mx.uqroo.ovar.controladores.unidadesmedidas;

import mx.uqroo.ovar.dominio.UnidadMedida;
import mx.uqroo.ovar.servicios.UnidadMedidaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 24/10/2010
 * Hora: 04:25:30 PM
 */
@Controller
@RequestMapping("/catalogos/unidadesmedidas/agregar")
public class AgregarUnidadMedidaControlador {

	@Autowired
	private UnidadMedidaServicio unidadMedidaServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model modelo) {
		UnidadMedida unidad = new UnidadMedida();

		modelo.addAttribute("titulo", "Agregar unidad de medida");
		modelo.addAttribute("unidad", unidad);

		return "unidadesmedidas/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute UnidadMedida unidad, BindingResult resultado) {
		unidadMedidaServicio.guardar(unidad);

		return "redirect:listado.form";
	}
}
