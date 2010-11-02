package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.UnidadMedidaDatos;
import mx.uqroo.ovar.dominio.UnidadMedida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 16/10/2010
 * Hora: 11:56:20 AM
 */
@Service("unidadMedidaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UnidadMedidaServicio {

	@Autowired
	private UnidadMedidaDatos unidadMedidaDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(UnidadMedida unidad) {
		unidadMedidaDatos.guardar(unidad);
	}

	public List<UnidadMedida> obtenerTodos() {
		return unidadMedidaDatos.obtenerTodos();
	}

	public UnidadMedida obtenerPorId(Long id) {
		return unidadMedidaDatos.obtenerPorId(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(UnidadMedida unidad) {
		unidadMedidaDatos.eliminar(unidad);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(long id) {
		UnidadMedida unidad = unidadMedidaDatos.obtenerPorId(id);
		eliminar(unidad);
	}
}
