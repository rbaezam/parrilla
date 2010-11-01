package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.UnidadResponsableDatos;
import mx.uqroo.ovar.dominio.UnidadResponsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 08:20:32 PM
 */
@Service("unidadResponsableServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UnidadResponsableServicio {

	@Autowired
	private UnidadResponsableDatos unidadResponsableDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(UnidadResponsable unidad) {
		unidadResponsableDatos.guardar(unidad);
	}

	public List<UnidadResponsable> obtenerTodos() {
		return unidadResponsableDatos.obtenerTodos();
	}

	public UnidadResponsable obtenerPorId(Long id) {
		return unidadResponsableDatos.obtenerPorId(id);
	}
}
