package mx.uqroo.ovar.datos;

import mx.uqroo.ovar.dominio.Variable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 06:08:15 PM
 */
@Repository
public class VariableDatos {

	@Autowired
	private SessionFactory sessionFactory;

	public void guardar(Variable variable) {
		sessionFactory.getCurrentSession().saveOrUpdate(variable);
	}

	public List<Variable> obtenerTodos() {
		return sessionFactory.getCurrentSession().createCriteria(Variable.class).list();
	}

	public Variable obtenerPorId(Long id) {
		return (Variable) sessionFactory.getCurrentSession().get(Variable.class, id);
	}
}
