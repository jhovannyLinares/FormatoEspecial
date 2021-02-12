package mx.formato.negocio.vo;

public class DistritoFederalVO {
	
	private Long id;
	
	private String cabeceraF;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCabeceraF() {
		return cabeceraF;
	}

	public void setCabeceraF(String cabeceraF) {
		this.cabeceraF = cabeceraF;
	}

	@Override
	public String toString() {
		return "DistritoFederalVO [id=" + id + ", cabeceraF=" + cabeceraF + "]";
	}


}
