package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.Tarea;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:05:16 PM
 */
@Repository
public class TareaDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(Tarea tarea) {
		sessionFactory.getCurrentSession().saveOrUpdate(tarea);
	}

	public List<Tarea> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(Tarea.class).list();
	}

	public Tarea obtenerPorId(Long id) {
		return (Tarea) sessionFactory.getCurrentSession().get(Tarea.class, id);
	}

	public void eliminar(Tarea tarea) {
		sessionFactory.getCurrentSession().delete(tarea);
	}
}