package mx.formato.negocio.vo;

public class DistritoLocalVO {
	private long id;
	private String cabecera;
	
	public DistritoLocalVO() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public DistritoLocalVO(long id, String cabecera) {
		super();
		this.id = id;
		this.cabecera = cabecera;
	}

	@Override
	public String toString() {
		return "DistritoLocalVO [id=" + id + ", cabecera=" + cabecera + "]";
	}
}
