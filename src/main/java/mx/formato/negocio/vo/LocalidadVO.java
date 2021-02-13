package mx.formato.negocio.vo;

public class LocalidadVO {

	private long id;
	private String descripcion;
	private MunicipioVO municipio;

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

	public MunicipioVO getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioVO municipio) {
		this.municipio = municipio;
	}

}
