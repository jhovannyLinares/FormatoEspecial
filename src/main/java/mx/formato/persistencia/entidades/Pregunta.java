package mx.formato.persistencia.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_pregunta")
public class Pregunta {
	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PREG_SEQ")
	@SequenceGenerator(sequenceName = "preguntas_seq", allocationSize = 1, name = "PREG_SEQ")
	private Long id;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "activa")
	private Integer activa;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_pregunta_id")
	private TipoPregunta tipoPregunta;

	@OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
	private List<Respuesta> respuestas;

	public Pregunta() {
		// TODO Auto-generated constructor stub
	}

	public Pregunta(Long id, String descripcion, Integer activa, TipoPregunta tipoPregunta) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.activa = activa;
		this.tipoPregunta = tipoPregunta;
	}

	public Pregunta(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getActiva() {
		return activa;
	}

	public void setActiva(Integer activa) {
		this.activa = activa;
	}

	public TipoPregunta getTipoPregunta() {
		return tipoPregunta;
	}

	public void setTipoPregunta(TipoPregunta tipoPregunta) {
		this.tipoPregunta = tipoPregunta;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

}
