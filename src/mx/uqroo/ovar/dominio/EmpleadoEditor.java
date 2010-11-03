package mx.uqroo.ovar.dominio;

import mx.uqroo.ovar.servicios.EmpleadoServicio;

import java.beans.PropertyEditorSupport;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 2/11/2010
 * Hora: 12:09:14 PM
 */
public class EmpleadoEditor extends PropertyEditorSupport {
	private EmpleadoServicio empleadoServicio;

	public EmpleadoEditor(EmpleadoServicio empleadoServicio) {
		this.empleadoServicio = empleadoServicio;
	}

	public void setAsText(String texto) {
		Empleado empleado = null;
		try {
			long id = Long.parseLong(texto);
			empleado = empleadoServicio.obtenerPorId(id);
			setValue(empleado);
		} catch(Exception e) {

		}
	}
}
