package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.Objetivo;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:03:22 PM
 */
@Repository
public class ObjetivoDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(Objetivo objetivo) {
		sessionFactory.getCurrentSession().saveOrUpdate(objetivo);
	}

	public List<Objetivo> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(Objetivo.class).list();
	}

	public Objetivo obtenerPorId(Long id) {
		return (Objetivo) sessionFactory.getCurrentSession().get(Objetivo.class, id);
	}

	public List<Objetivo> obtenerPorIdParrilla(Long idParrilla) {
		List<Objetivo> lista = sessionFactory.getCurrentSession().createCriteria(Objetivo.class)
				.add(Restrictions.eq("parrilla.id", idParrilla)).list();
		return lista;
	}

	public void eliminar(Objetivo objetivo) {
		sessionFactory.getCurrentSession().delete(objetivo);
	}
}
