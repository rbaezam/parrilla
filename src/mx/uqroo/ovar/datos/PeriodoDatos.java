package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.Periodo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 02:26:10 PM
 */
@Repository
public class PeriodoDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(Periodo periodo) {
		sessionFactory.getCurrentSession().saveOrUpdate(periodo);
	}

	public List<Periodo> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(Periodo.class).list();
	}

	public Periodo obtenerPorId(Long id) {
		return (Periodo) sessionFactory.getCurrentSession().get(Periodo.class, id);
	}
}
