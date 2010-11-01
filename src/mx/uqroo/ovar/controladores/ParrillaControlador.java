package mx.uqroo.ovar.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 29/10/2010
 * Hora: 08:34:10 PM
 */
@Controller
@RequestMapping("/parrilla")
public class ParrillaControlador {

	@RequestMapping(method = RequestMethod.GET)
	public String parrilla() {
		return "parrilla";
	}
}
