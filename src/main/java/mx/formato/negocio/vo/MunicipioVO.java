package mx.formato.negocio.vo;

import java.util.List;

import mx.formato.persistencia.entidades.Localidad;

public class MunicipioVO {

	private long id;
	private String descripcion;
	private List<LocalidadVO> seccionesElectorales;

	public MunicipioVO() {
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

	public List<LocalidadVO> getSeccionesElectorales() {
		return seccionesElectorales;
	}

	public void setSeccionesElectorales(List<LocalidadVO> seccionesElectorales) {
		this.seccionesElectorales = seccionesElectorales;
	}

}
