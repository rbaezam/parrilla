package mx.uqroo.ovar.controladores.empleados;

import mx.uqroo.ovar.dominio.Empleado;
import mx.uqroo.ovar.dominio.UnidadResponsable;
import mx.uqroo.ovar.dominio.UnidadResponsableEditor;
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
 * Hora: 10:45:27 PM
 */
@Controller
@RequestMapping("/catalogos/empleados/modificar")
public class ModificarEmpleadoControlador {

	@Autowired
	private EmpleadoServicio empleadoServicio;

	@Autowired
	private UnidadResponsableServicio unidadResponsableServicio;

	@ModelAttribute("unidadesResponsables")
	public List<UnidadResponsable> llenarComboUnidades() {
		return unidadResponsableServicio.obtenerTodos();
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(UnidadResponsable.class, new UnidadResponsableEditor(unidadResponsableServicio));
	}	

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@RequestParam(required = true, value = "id") Long id, Model modelo) {
		Empleado empleado = empleadoServicio.obtenerPorId(id);

		modelo.addAttribute("titulo", "Modificar empleado");
		modelo.addAttribute("empleado", empleado);

		return "empleados/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute Empleado empleado, BindingResult resultado) {
		empleadoServicio.guardar(empleado);

		return "redirect:listado.form";
	}
}
