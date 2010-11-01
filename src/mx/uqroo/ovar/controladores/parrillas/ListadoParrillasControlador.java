package mx.uqroo.ovar.controladores.parrillas;

import mx.uqroo.ovar.dominio.Parrilla;
import mx.uqroo.ovar.servicios.ParrillaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 27/10/2010
 * Hora: 01:38:33 PM
 */
@Controller
@RequestMapping("/parrillas/listado")
public class ListadoParrillasControlador {

	@Autowired
	private ParrillaServicio parrillaServicio;

	@RequestMapping(method = RequestMethod.GET)
	public String listado(Model modelo) {
		List<Parrilla> parrillas = parrillaServicio.obtenerTodos();

		modelo.addAttribute("parrillas", parrillas);

		return "parrillas/listado";
	}
}
