package mx.formato.negocio.vo;


public class PreguntaVO {
	
	private Long id;
	private String descripcion;
	private Integer activa;
	
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

	@Override
	public String toString() {
		return "PreguntaVO [id=" + id + ", descripcion=" + descripcion + ", activa=" + activa + "]";
	}
	
}
