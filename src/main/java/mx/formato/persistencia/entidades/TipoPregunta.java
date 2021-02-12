package mx.formato.persistencia.entidades;

import javax.persistence.*;

@Entity
@Table(name = "c_tipo_pregunta")
public class TipoPregunta {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPOPREG_SEQ")
	@SequenceGenerator(sequenceName = "tipopreguntas_seq", allocationSize = 1, name = "TIPOPREG_SEQ")
	private Long id;

	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToOne(mappedBy = "tipoPregunta",fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_pregunta_id")
	private Pregunta pregunta;
	
	public TipoPregunta() {
		// TODO Auto-generated constructor stub
	}

	public TipoPregunta(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
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

}
