package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.Empleado;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:01:12 PM
 */
@Repository
public class EmpleadoDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(Empleado empleado) {
		sessionFactory.getCurrentSession().saveOrUpdate(empleado);
	}

	public List<Empleado> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(Empleado.class).list();
	}

	public Empleado obtenerPorId(Long id) {
		return (Empleado) sessionFactory.getCurrentSession().get(Empleado.class, id);
	}
}
