package mx.formato.negocio.vo;

public class GeneralVO {
	
	private Long id;
	private String entrevistador;
	private int entrevistado;
	private String folio;
	public GeneralVO() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntrevistador() {
		return entrevistador;
	}
	public void setEntrevistador(String entrevistador) {
		this.entrevistador = entrevistador;
	}
	public int getEntrevistado() {
		return entrevistado;
	}
	public void setEntrevistado(int entrevistado) {
		this.entrevistado = entrevistado;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	
	public GeneralVO(Long id, String entrevistador, int entrevistado, String folio) {
		super();
		this.id = id;
		this.entrevistador = entrevistador;
		this.entrevistado = entrevistado;
		this.folio = folio;
	}
	
	@Override
	public String toString() {
		return "GeneralVO [id=" + id + ", entrevistador=" + entrevistador + ", entrevistado=" + entrevistado
				+ ", folio=" + folio + "]";
	}
	
	
	
	
}
