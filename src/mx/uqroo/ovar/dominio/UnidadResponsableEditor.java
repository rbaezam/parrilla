package mx.uqroo.ovar.dominio;

import mx.uqroo.ovar.servicios.UnidadResponsableServicio;

import java.beans.PropertyEditorSupport;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 26/10/2010
 * Hora: 04:07:55 PM
 */
public class UnidadResponsableEditor extends PropertyEditorSupport {

	private UnidadResponsableServicio unidadResponsableServicio;

	public UnidadResponsableEditor(UnidadResponsableServicio unidadResponsableServicio) {
		this.unidadResponsableServicio = unidadResponsableServicio;
	}

	public void setAsText(String texto) {
		UnidadResponsable unidad = null;
		try {
			Long urId = Long.parseLong(texto);
			unidad = unidadResponsableServicio.obtenerPorId(urId);
		} catch(Exception e) {
			
		}
		setValue(unidad);
	}

}
