package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.Parrilla;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:09:34 PM
 */
@Repository
public class ParrillaDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(Parrilla parrilla) {
		sessionFactory.getCurrentSession().saveOrUpdate(parrilla);
	}

	public List<Parrilla> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(Parrilla.class).list();
	}

	public Parrilla obtenerPorId(Long id) {
		return (Parrilla) sessionFactory.getCurrentSession().get(Parrilla.class, id);
	}

	public void eliminar(Parrilla parrilla) {
		sessionFactory.getCurrentSession().delete(parrilla);
	}
}
