package mx.uqroo.ovar.dominio;

import mx.uqroo.ovar.servicios.PeriodoServicio;

import java.beans.PropertyEditorSupport;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 28/10/2010
 * Hora: 09:04:41 PM
 */
public class PeriodoEditor extends PropertyEditorSupport {

	private PeriodoServicio periodoServicio;

	public PeriodoEditor(PeriodoServicio periodoServicio) {
		this.periodoServicio = periodoServicio;
	}

	public void setAsText(String texto) {
		Periodo periodo = null;
		try {
			Long id = Long.parseLong(texto);
			periodo = periodoServicio.obtenerPorId(id);
		} catch(Exception e) {

		}
		setValue(periodo);
	}
}
