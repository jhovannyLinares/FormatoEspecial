package mx.formato.negocio.vo;

import mx.formato.persistencia.entidades.DistritoLocal;

public class MunicipioVO {

	private long id;
	private String descripcion;
	private DistritoLocal distritoLocal;

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

	public DistritoLocal getDistritoLocal() {
		return distritoLocal;
	}

	public void setDistritoLocal(DistritoLocal distritoLocal) {
		this.distritoLocal = distritoLocal;
	}

}
