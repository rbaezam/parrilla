package mx.uqroo.ovar.controladores.unidadesresponsables;

import mx.uqroo.ovar.servicios.UnidadResponsableServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 24/10/2010
 * Hora: 11:13:49 PM
 */
@Controller
@RequestMapping("/catalogos/unidadesresponsables/listado")
public class ListadoUnidadesResponsablesControlador {

	@Autowired
	private UnidadResponsableServicio unidadResponsableServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String listado(Model modelo) {
		modelo.addAttribute("unidades", unidadResponsableServicio.obtenerTodos());
		return "unidadesresponsables/listado";
	}
}
