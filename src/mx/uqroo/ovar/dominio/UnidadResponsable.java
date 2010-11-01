package mx.uqroo.ovar.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: Rodolfo
 * Date: 15/10/2010
 * Time: 01:49:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class UnidadResponsable {

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
