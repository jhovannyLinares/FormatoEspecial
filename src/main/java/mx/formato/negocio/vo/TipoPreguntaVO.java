package mx.formato.negocio.vo;

public class TipoPreguntaVO {

	private Long id;
	private String descripcion;
	
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
	
	@Override
	public String toString() {
		return "TipoPreguntaVO [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
}
