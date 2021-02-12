package mx.formato.negocio.vo;

import java.util.List;

public class LocalidadVO {

	private long id;
	private String descripcion;
	private List<SeccionElectoralVO> seccion;

	public LocalidadVO() {
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

	public List<SeccionElectoralVO> getSeccion() {
		return seccion;
	}

	public void setSeccion(List<SeccionElectoralVO> seccion) {
		this.seccion = seccion;
	}

}
