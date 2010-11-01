package mx.uqroo.ovar.controladores.unidadesmedidas;

import mx.uqroo.ovar.servicios.UnidadMedidaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 24/10/2010
 * Hora: 03:56:53 PM
 */
@Controller
@RequestMapping("/catalogos/unidadesmedidas/listado")
public class ListadoUnidadesMedidaControlador {

	@Autowired
	private UnidadMedidaServicio unidadMedidaServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String listado(Model modelo) {
		modelo.addAttribute("unidades", unidadMedidaServicio.obtenerTodos());
		return "unidadesmedidas/listado";
	}
}
