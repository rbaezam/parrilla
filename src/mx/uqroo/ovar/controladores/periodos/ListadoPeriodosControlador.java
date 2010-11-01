package mx.uqroo.ovar.controladores.periodos;

import mx.uqroo.ovar.servicios.PeriodoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/catalogos/periodos/listado")
public class ListadoPeriodosControlador {

	@Autowired
	private PeriodoServicio periodoServicio;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listado() {
		Map modelo = new HashMap();
		modelo.put("periodos", periodoServicio.obtenerTodos());

		return new ModelAndView("periodos/listado", modelo);
	}
}
