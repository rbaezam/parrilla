package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.TareaDatos;
import mx.uqroo.ovar.dominio.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 07:49:06 PM
 */
@Service("tareaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TareaServicio {

	@Autowired
	private TareaDatos tareaDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(Tarea tarea) {
		tareaDatos.guardar(tarea);
	}

	public List<Tarea> obtenerTodos() {
		return tareaDatos.obtenerTodos();
	}

	public Tarea obtenerPorId(Long id) {
		return tareaDatos.obtenerPorId(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(Tarea tarea) {
		tareaDatos.eliminar(tarea);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(long id) {
		Tarea tarea = tareaDatos.obtenerPorId(id);
		eliminar(tarea);
	}
}
