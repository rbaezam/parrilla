package mx.uqroo.ovar.controladores.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 19/10/2010
 * Hora: 06:29:54 PM
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(method = RequestMethod.GET)
	public String inicio() {
		return "admin/index";
	}
}
