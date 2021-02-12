package mx.formato.persistencia.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_respuesta")
public class Respuesta {
	@Id
	@Column(unique = true, name = "id_respuesta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESP_SEQ")
	@SequenceGenerator(sequenceName = "respuestas_seq", allocationSize = 1, name = "RESP_SEQ")
	private Long id;

	@Column(name = "respuesta")
	private String respuesta;

	@Column(name = "prioridad")
	private Integer prioridad;

	@ManyToOne(fetch = FetchType.LAZY)
	private Pregunta pregunta;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private General general;

	public Respuesta() {
		// TODO Auto-generated constructor stub
	}

	public Respuesta(String respuesta, Integer prioridad, Pregunta pregunta, General general) {
		super();
		this.respuesta = respuesta;
		this.prioridad = prioridad;
		this.pregunta = pregunta;
		this.general = general;
	}

	public Respuesta(String respuesta, Pregunta pregunta, General general) {
		super();
		this.respuesta = respuesta;
		this.pregunta = pregunta;
		this.general = general;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	@Override
	public String toString() {
		return "Respuesta [id=" + id + ", respuesta=" + respuesta + ", prioridad=" + prioridad + ", pregunta="
				+ pregunta + ", general=" + general + "]";
	}

}
