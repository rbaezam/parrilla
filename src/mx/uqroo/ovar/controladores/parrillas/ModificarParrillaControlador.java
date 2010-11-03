package mx.uqroo.ovar.controladores.parrillas;

import mx.uqroo.ovar.dominio.*;
import mx.uqroo.ovar.servicios.EmpleadoServicio;
import mx.uqroo.ovar.servicios.ParrillaServicio;
import mx.uqroo.ovar.servicios.PeriodoServicio;
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
 * Fecha: 29/10/2010
 * Hora: 08:14:34 PM
 */
@Controller
@RequestMapping("/parrillas/modificar")
public class ModificarParrillaControlador {

	@Autowired
	private ParrillaServicio parrillaServicio;

	@Autowired
	private UnidadResponsableServicio unidadResponsableServicio;

	@Autowired
	private PeriodoServicio periodoServicio;

	@Autowired
	private EmpleadoServicio empleadoServicio;

	@ModelAttribute("unidadesResponsables")
	public List<UnidadResponsable> llenarComboUnidades() {
		return unidadResponsableServicio.obtenerTodos();
	}

	@ModelAttribute("periodos")
	public List<Periodo> llenarComboPeriodos() {
		return periodoServicio.obtenerTodos();
	}

	@ModelAttribute("empleados")
	public List<Empleado> llenarComboEmpleados() {
		return empleadoServicio.obtenerTodos();
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(UnidadResponsable.class, new UnidadResponsableEditor(unidadResponsableServicio));
		binder.registerCustomEditor(Periodo.class, new PeriodoEditor(periodoServicio));
		binder.registerCustomEditor(Empleado.class, new EmpleadoEditor(empleadoServicio));
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@RequestParam(required = true, value = "id") long id, Model modelo) {

		Parrilla parrilla = parrillaServicio.obtenerPorId(id);

		modelo.addAttribute("titulo", "Modificar parrilla");
		modelo.addAttribute("parrilla", parrilla);

		return "parrillas/formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute Parrilla parrilla, BindingResult resultado) {
		parrillaServicio.guardar(parrilla);

		return "redirect:listado.form";
	}

}
