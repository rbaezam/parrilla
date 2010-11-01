package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.UnidadResponsable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:06:44 PM
 */
@Repository
public class UnidadResponsableDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(UnidadResponsable unidad) {
		sessionFactory.getCurrentSession().saveOrUpdate(unidad);
	}

	public List<UnidadResponsable> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(UnidadResponsable.class).list();
	}

	public UnidadResponsable obtenerPorId(Long id) {
		return (UnidadResponsable) sessionFactory.getCurrentSession().get(UnidadResponsable.class, id);
	}
}
