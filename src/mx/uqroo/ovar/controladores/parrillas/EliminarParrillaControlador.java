package mx.uqroo.ovar.controladores.parrillas;

import mx.uqroo.ovar.servicios.ParrillaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 29/10/2010
 * Hora: 07:38:34 PM
 */
@Controller
@RequestMapping("/parrillas/eliminar")
public class EliminarParrillaControlador {

	@Autowired
	private ParrillaServicio parrillaServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String eliminar(@RequestParam(required = true, value = "id") long id) {
		parrillaServicio.eliminar(id);
		return "redirect:listado.form";
	}
}
