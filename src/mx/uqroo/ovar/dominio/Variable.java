package mx.uqroo.ovar.dominio;

import javax.persistence.*;
import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 05:54:52 PM
 */
@Entity
public class Variable {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	@ManyToOne
	private Objetivo objetivo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "variable")
	private List<Tarea> tareas;

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

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}
}
