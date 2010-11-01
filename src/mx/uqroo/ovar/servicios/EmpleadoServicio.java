package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.EmpleadoDatos;
import mx.uqroo.ovar.dominio.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:12:17 PM
 */
@Service("empleadoServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmpleadoServicio {

	@Autowired
	private EmpleadoDatos empleadoDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(Empleado empleado) {
		empleadoDatos.guardar(empleado);
	}

	public List<Empleado> obtenerTodos() {
		return empleadoDatos.obtenerTodos();
	}

	public Empleado obtenerPorId(Long id) {
		return empleadoDatos.obtenerPorId(id);
	}
}
