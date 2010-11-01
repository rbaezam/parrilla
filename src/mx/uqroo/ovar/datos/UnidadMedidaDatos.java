package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.UnidadMedida;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 16/10/2010
 * Hora: 11:54:34 AM
 */
@Repository
public class UnidadMedidaDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(UnidadMedida unidad) {
		sessionFactory.getCurrentSession().saveOrUpdate(unidad);
	}

	public List<UnidadMedida> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(UnidadMedida.class).list();
	}

	public UnidadMedida obtenerPorId(Long id) {
		return (UnidadMedida) sessionFactory.getCurrentSession().get(UnidadMedida.class, id);
	}
}
