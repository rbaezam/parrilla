
package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.ParrillaDatos;
import mx.uqroo.ovar.dominio.Parrilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 07:22:35 PM
 */
@Service("parrillaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ParrillaServicio {

	@Autowired
	private ParrillaDatos parrillaDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(Parrilla parrilla) {
		parrillaDatos.guardar(parrilla);
	}

	public List<Parrilla> obtenerTodos() {
		return parrillaDatos.obtenerTodos();
	}

	public Parrilla obtenerPorId(Long id) {
		return parrillaDatos.obtenerPorId(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(Parrilla parrilla) {
		parrillaDatos.eliminar(parrilla);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(long id) {
		Parrilla parrilla = obtenerPorId(id);
		eliminar(parrilla);
	}
}
