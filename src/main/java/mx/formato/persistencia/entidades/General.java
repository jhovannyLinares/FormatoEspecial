package mx.formato.persistencia.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name = "t_general")
public class General {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_general_SEQ")
	@SequenceGenerator(sequenceName = "T_general_SEQ", allocationSize = 1, name = "T_general_SEQ")
	private Long id;

	@Column(name = "entrevistador")
	private String entrevistador;

	@Column(name = "folio")
	private String folio;

	/* Relación con entidad Persona */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "persona_id")
	private Persona persona;

	/* Relación con entidad Usuario */
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "general",cascade = CascadeType.ALL)
	private List<Respuesta> respuestas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntrevistador() {
		return entrevistador;
	}

	public void setEntrevistador(String entrevistador) {
		this.entrevistador = entrevistador;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	@Override
	public String toString() {
		return "General [id=" + id + ", entrevistador=" + entrevistador + ", folio=" + folio + ", persona=" + persona
				+ ", usuario=" + usuario + ", respuestas=" + respuestas + "]";
	}

}
