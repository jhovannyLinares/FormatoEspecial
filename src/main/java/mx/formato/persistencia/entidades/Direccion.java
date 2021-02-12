package mx.formato.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_direccion")
public class Direccion {

	@Id
	@Column(unique = true, name = "id_direccion")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_direccion_SEQ")
	@SequenceGenerator(sequenceName = "T_direccion_SEQ", allocationSize = 1, name = "T_direccion_SEQ")
	private long id_direccion;

	@Column(name = "calle")
	private String calle;

	@Column(name = "numero_exterior")
	private String numero_exterior;

	@Column(name = "numero_interior")
	private String numero_interior;

	@Column(name = "manzana")
	private String manzana;

	@Column(name = "lote")
	private String lote;

	@Column(name = "colonia")
	private String colonia;

	@Column(name = "mz_mapa")
	private String mz_mapa;

	@Column(name = "referencia")
	private String referencia;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_persona")
	private Persona persona;

	/** RELACION CON FK */

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_federal")
	@Column(name = "id_federal")
	private Long federal;

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_local")
	@Column(name = "id_local")
	private Long local;

	/** MUNICIPIO */
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_municipio")
	@Column(name = "id_municipio")
	private Long municipio;

	/** LOCALIDAD */
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_localidad")
	@Column(name = "id_localidad")
	private Long localidad;

	/** SECCION_ELECTORAL */
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_seccion")
	@Column(name = "id_seccion")
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
		return "Direccion [id_direccion=" + id_direccion + ", calle=" + calle + ", numero_exterior=" + numero_exterior
				+ ", numero_interior=" + numero_interior + ", manzana=" + manzana + ", lote=" + lote + ", colonia="
				+ colonia + ", mz_mapa=" + mz_mapa + ", referencia=" + referencia + ", persona=" + persona
				+ ", federal=" + federal + ", local=" + local + ", municipio=" + municipio + ", localidad=" + localidad
				+ ", seccionElectoral=" + seccionElectoral + "]";
	}

}
