package mx.uqroo.ovar.dominio;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Usuario: Rodolfo E. Baeza Madrid
 * Fecha: 15/10/2010
 * Hora: 05:50:08 PM
 */
@Entity
public class Objetivo {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	@ManyToOne
	private Parrilla parrilla;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "objetivo")
	private List<Variable> variables;

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

	@JsonIgnore
	public Parrilla getParrilla() {
		return parrilla;
	}

	public void setParrilla(Parrilla parrilla) {
		this.parrilla = parrilla;
	}

	@JsonIgnore
	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}
}
