package mx.formato.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "c_localidad")
public class Localidad {

	public Localidad() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(unique = true, name = "id_localidad")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_localidad_SEQ")
	@SequenceGenerator(sequenceName = "T_localidad_SEQ", allocationSize = 1, name = "T_localidad_SEQ")
	private long id;

	@Column(name = "descripcion_localidad")
	private String descripcion;

	/** UNA A MUCHAS */
	/** relacion con seccion */
	@ManyToOne
	@JoinColumn(name = "seccion_id")
	private SeccionElectoral seccionElectoral;

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

	public SeccionElectoral getSeccionElectoral() {
		return seccionElectoral;
	}

	public void setSeccionElectoral(SeccionElectoral seccionElectoral) {
		this.seccionElectoral = seccionElectoral;
	}

}
