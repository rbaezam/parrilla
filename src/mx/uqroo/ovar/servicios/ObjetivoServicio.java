package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.ObjetivoDatos;
import mx.uqroo.ovar.dominio.Objetivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 07:10:44 PM
 */
@Service("objetivoServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ObjetivoServicio {

	@Autowired
	private ObjetivoDatos objetivoDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(Objetivo objetivo) {
		objetivoDatos.guardar(objetivo);
	}

	public List<Objetivo> obtenerTodos() {
		return objetivoDatos.obtenerTodos();
	}

	public Objetivo obtenerPorId(Long id) {
		return objetivoDatos.obtenerPorId(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(Objetivo objetivo) {
		objetivoDatos.eliminar(objetivo);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void eliminar(long id) {
		Objetivo objetivo = objetivoDatos.obtenerPorId(id);
		objetivoDatos.eliminar(objetivo);
	}
}
