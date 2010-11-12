package mx.uqroo.ovar.dominio;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

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
	@ManyToOne
	private Empleado responsable;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parrilla")
	@Fetch(FetchMode.JOIN)
	private List<Objetivo> objetivos;
	private boolean valido;

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

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public List<Objetivo> getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(List<Objetivo> objetivos) {
		this.objetivos = objetivos;
	}

	public String getDescripcion() {
		return String.format("%s - %s", periodo.getDescripcion(), unidad.getNombre());
	}
}
