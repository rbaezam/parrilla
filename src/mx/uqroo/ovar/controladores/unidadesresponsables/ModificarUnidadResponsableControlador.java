package mx.uqroo.ovar.controladores.unidadesresponsables;

import mx.uqroo.ovar.dominio.Empleado;
import mx.uqroo.ovar.dominio.EmpleadoEditor;
import mx.uqroo.ovar.dominio.UnidadResponsable;
import mx.uqroo.ovar.servicios.EmpleadoServicio;
import mx.uqroo.ovar.servicios.UnidadResponsableServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 24/10/2010
 * Hora: 11:25:17 PM
 */
@Controller
@RequestMapping("/catalogos/unidadesresponsables/modificar")
public class ModificarUnidadResponsableControlador {

	@Autowired
	private UnidadResponsableServicio unidadResponsableServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@RequestParam(required = true, value = "id") Long id, Model modelo) {
		UnidadResponsable unidad = unidadResponsableServicio.obtenerPorId(id);

		modelo.addAttribute("titulo", "Modificar unidad responsable");
		modelo.addAttribute("unidad", unidad);

		return "unidadesresponsables/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute UnidadResponsable unidad, BindingResult resultado) {
		unidadResponsableServicio.guardar(unidad);

		return "redirect:listado.form";
	}
}
