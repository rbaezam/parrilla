package mx.uqroo.ovar.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 01:51:32 PM
 */
@Entity
public class Parrilla {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Periodo periodo;
	@ManyToOne
	private UnidadResponsable unidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public UnidadResponsable getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadResponsable unidad) {
		this.unidad = unidad;
	}
}
