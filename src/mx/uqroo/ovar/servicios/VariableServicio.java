package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.VariableDatos;
import mx.uqroo.ovar.dominio.Variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 08:24:45 PM
 */
@Service("variableServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class VariableServicio {

	@Autowired
	private VariableDatos variableDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(Variable variable) {
		variableDatos.guardar(variable);
	}

	public List<Variable> obtenerTodos() {
		return variableDatos.obtenerTodos();
	}

	public Variable obtenerPorId(Long id) {
		return variableDatos.obtenerPorId(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(Variable variable) {
		variableDatos.eliminar(variable);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(long id) {
		Variable variable = variableDatos.obtenerPorId(id);
		eliminar(variable);
	}
}
