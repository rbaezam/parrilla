package mx.uqroo.ovar.dominio;

import javax.persistence.*;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Horario: 01:52:28 PM
 */
@Entity
public class Empleado {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String puesto;
	@ManyToOne(optional = true)
	private UnidadResponsable unidad;

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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public UnidadResponsable getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadResponsable unidad) {
		this.unidad = unidad;
	}
}
