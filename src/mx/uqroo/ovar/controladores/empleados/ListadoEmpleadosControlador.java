package mx.uqroo.ovar.controladores.empleados;

import mx.uqroo.ovar.servicios.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 24/10/2010
 * Hora: 08:26:37 PM
 */
@Controller
@RequestMapping("/catalogos/empleados/listado")
public class ListadoEmpleadosControlador {

	@Autowired
	private EmpleadoServicio empleadoServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String listado(Model modelo) {
		modelo.addAttribute("empleados", empleadoServicio.obtenerTodos());
		return "empleados/listado";
	}
}
