package mx.formato.persistencia.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "t_usuario")
public class Usuario {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_USUARIO_SEQ")
	@SequenceGenerator(sequenceName = "T_USUARIO_SEQ", allocationSize = 1, name = "T_USUARIO_SEQ")
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "paswword")
	private String paswword;
	
	//Relación con entidad General
	@OneToMany(mappedBy = "",fetch = FetchType.LAZY)
	private List<General> general;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String nombre, String paswword) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.paswword = paswword;
	}

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

	public String getPaswword() {
		return paswword;
	}

	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}

}
