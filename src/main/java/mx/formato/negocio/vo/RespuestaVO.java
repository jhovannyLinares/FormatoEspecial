package mx.formato.negocio.vo;

public class RespuestaVO {

	private Long id;
	private String respuesta;
	private Integer prioridad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Integer getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "RespuestaVO [id=" + id + ", respuesta=" + respuesta + ", prioridad=" + prioridad + "]";
	}

}
