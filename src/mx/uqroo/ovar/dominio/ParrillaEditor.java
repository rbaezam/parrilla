package mx.uqroo.ovar.dominio;

import mx.uqroo.ovar.servicios.ParrillaServicio;

import java.beans.PropertyEditorSupport;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 3/11/2010
 * Hora: 03:26:00 PM
 */
public class ParrillaEditor extends PropertyEditorSupport {

	private ParrillaServicio parrillaServicio;

	public ParrillaEditor(ParrillaServicio parrillaServicio) {
		this.parrillaServicio = parrillaServicio;
	}

	public void setAsText(String texto) {
		Parrilla parrilla = null;
		try {
			long id = Long.parseLong(texto);
			parrilla = parrillaServicio.obtenerPorId(id);
			setValue(parrilla);
		} catch(Exception e) {
			
		}
	}
}
