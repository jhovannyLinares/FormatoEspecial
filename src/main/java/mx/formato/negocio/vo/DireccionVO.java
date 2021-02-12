package mx.formato.negocio.vo;

import mx.formato.persistencia.entidades.Persona;

public class DireccionVO {

	private long id_direccion;

	private String calle;

	private String numero_exterior;

	private String numero_interior;

	private String manzana;

	private String lote;

	private String colonia;

	private String mz_mapa;

	private String referencia;

	private Persona persona;

	private Long federal;

	private Long local;

	private Long municipio;

	private Long localidad;

	private Long seccionElectoral;

	public long getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(long id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero_exterior() {
		return numero_exterior;
	}

	public void setNumero_exterior(String numero_exterior) {
		this.numero_exterior = numero_exterior;
	}

	public String getNumero_interior() {
		return numero_interior;
	}

	public void setNumero_interior(String numero_interior) {
		this.numero_interior = numero_interior;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMz_mapa() {
		return mz_mapa;
	}

	public void setMz_mapa(String mz_mapa) {
		this.mz_mapa = mz_mapa;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Long getFederal() {
		return federal;
	}

	public void setFederal(Long federal) {
		this.federal = federal;
	}

	public Long getLocal() {
		return local;
	}

	public void setLocal(Long local) {
		this.local = local;
	}

	public Long getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Long municipio) {
		this.municipio = municipio;
	}

	public Long getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Long localidad) {
		this.localidad = localidad;
	}

	public Long getSeccionElectoral() {
		return seccionElectoral;
	}

	public void setSeccionElectoral(Long seccionElectoral) {
		this.seccionElectoral = seccionElectoral;
	}

	@Override
	public String toString() {
		return "DireccionVO [id_direccion=" + id_direccion + ", calle=" + calle + ", numero_exterior=" + numero_exterior
				+ ", numero_interior=" + numero_interior + ", manzana=" + manzana + ", lote=" + lote + ", colonia="
				+ colonia + ", mz_mapa=" + mz_mapa + ", referencia=" + referencia + ", persona=" + persona
				+ ", federal=" + federal + ", local=" + local + ", municipio=" + municipio + ", localidad=" + localidad
				+ ", seccionElectoral=" + seccionElectoral + "]";
	}

}
