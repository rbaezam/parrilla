package mx.uqroo.ovar.servicios;

import mx.uqroo.ovar.datos.PeriodoDatos;
import mx.uqroo.ovar.dominio.Periodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 02:24:53 PM
 */
@Service("periodoServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PeriodoServicio {

	@Autowired
	private PeriodoDatos periodoDatos;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void guardar(Periodo periodo) {
		periodoDatos.guardar(periodo);
	}

	public List<Periodo> obtenerTodos() {
		return periodoDatos.obtenerTodos();
	}

	public Periodo obtenerPorId(Long id) {
		return periodoDatos.obtenerPorId(id);
	}
}
