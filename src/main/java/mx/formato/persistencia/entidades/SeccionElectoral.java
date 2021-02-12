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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "c_seccionElectoral")
public class SeccionElectoral {

	@Id
	@Column(unique = true, name = "id_seccion")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_SECCION_SEQ")
	@SequenceGenerator(sequenceName = "T_SECCION_SEQ", allocationSize = 1, name = "T_SECCION_SEQ")
	private long id;

	@Column(name = "descripcion_seccion")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "id_municipio")
	private Municipio municipio;

	@OneToMany(mappedBy = "seccionElectoral", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Localidad> localidades;
	
	public SeccionElectoral() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}

	

}
