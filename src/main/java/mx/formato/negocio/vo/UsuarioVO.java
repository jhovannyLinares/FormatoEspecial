package mx.formato.negocio.vo;

public class UsuarioVO {

	private Long id;
	private String nombre;
	private String paswword;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaswword() {
		return paswword;
	}
	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}
	
	@Override
	public String toString() {
		return "UsuarioVO [id=" + id + ", nombre=" + nombre + ", paswword=" + paswword + "]";
	}

}
