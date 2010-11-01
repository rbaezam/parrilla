package mx.uqroo.ovar.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 16/10/2010
 * Hora: 11:52:20 AM
 */
@Entity
public class UnidadMedida {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
