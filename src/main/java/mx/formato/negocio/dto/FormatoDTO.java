package mx.formato.negocio.dto;

import java.io.Serializable;

import mx.formato.negocio.vo.DireccionVO;
import mx.formato.negocio.vo.GeneralVO;
import mx.formato.negocio.vo.PersonaVO;
import mx.formato.negocio.vo.RespuestaVO;
import mx.formato.negocio.vo.UsuarioVO;

public class FormatoDTO implements Serializable {

	private static final long serialVersionUID = -4801016323544635906L;

	private DireccionVO direccion;

	private PersonaVO persona;

	private GeneralVO general;

	private RespuestaVO pregunta1 = new RespuestaVO();
	private RespuestaVO pregunta2 = new RespuestaVO();
	private RespuestaVO pregunta3 = new RespuestaVO();

	private RespuestaVO pregunta4_1 = new RespuestaVO();
	private RespuestaVO pregunta4_2 = new RespuestaVO();
	private RespuestaVO pregunta4_3 = new RespuestaVO();

	private RespuestaVO pregunta5_1 = new RespuestaVO();
	private RespuestaVO pregunta5_2 = new RespuestaVO();
	private RespuestaVO pregunta5_3 = new RespuestaVO();
	private RespuestaVO pregunta5_4 = new RespuestaVO();
	private RespuestaVO pregunta5_5 = new RespuestaVO();
	private RespuestaVO pregunta5_6 = new RespuestaVO();
	private RespuestaVO pregunta5_7 = new RespuestaVO();
	private RespuestaVO pregunta5_8 = new RespuestaVO();
	private RespuestaVO pregunta5_9 = new RespuestaVO();
	private RespuestaVO pregunta5_10 = new RespuestaVO();

	private RespuestaVO pregunta6_1 = new RespuestaVO();
	private RespuestaVO pregunta6_2 = new RespuestaVO();
	private RespuestaVO pregunta6_3 = new RespuestaVO();

	private RespuestaVO pregunta7 = new RespuestaVO();
	private RespuestaVO pregunta8 = new RespuestaVO();
	private RespuestaVO pregunta9 = new RespuestaVO();

	private UsuarioVO usuario;

	public DireccionVO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionVO direccion) {
		this.direccion = direccion;
	}

	public PersonaVO getPersona() {
		return persona;
	}

	public void setPersona(PersonaVO persona) {
		this.persona = persona;
	}

	public GeneralVO getGeneral() {
		return general;
	}

	public void setGeneral(GeneralVO general) {
		this.general = general;
	}

	public RespuestaVO getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(RespuestaVO pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public RespuestaVO getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(RespuestaVO pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public RespuestaVO getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(RespuestaVO pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public RespuestaVO getPregunta4_1() {
		return pregunta4_1;
	}

	public void setPregunta4_1(RespuestaVO pregunta4_1) {
		this.pregunta4_1 = pregunta4_1;
	}

	public RespuestaVO getPregunta4_2() {
		return pregunta4_2;
	}

	public void setPregunta4_2(RespuestaVO pregunta4_2) {
		this.pregunta4_2 = pregunta4_2;
	}

	public RespuestaVO getPregunta4_3() {
		return pregunta4_3;
	}

	public void setPregunta4_3(RespuestaVO pregunta4_3) {
		this.pregunta4_3 = pregunta4_3;
	}

	public RespuestaVO getPregunta5_1() {
		return pregunta5_1;
	}

	public void setPregunta5_1(RespuestaVO pregunta5_1) {
		this.pregunta5_1 = pregunta5_1;
	}

	public RespuestaVO getPregunta5_2() {
		return pregunta5_2;
	}

	public void setPregunta5_2(RespuestaVO pregunta5_2) {
		this.pregunta5_2 = pregunta5_2;
	}

	public RespuestaVO getPregunta5_3() {
		return pregunta5_3;
	}

	public void setPregunta5_3(RespuestaVO pregunta5_3) {
		this.pregunta5_3 = pregunta5_3;
	}

	public RespuestaVO getPregunta5_4() {
		return pregunta5_4;
	}

	public void setPregunta5_4(RespuestaVO pregunta5_4) {
		this.pregunta5_4 = pregunta5_4;
	}

	public RespuestaVO getPregunta5_5() {
		return pregunta5_5;
	}

	public void setPregunta5_5(RespuestaVO pregunta5_5) {
		this.pregunta5_5 = pregunta5_5;
	}

	public RespuestaVO getPregunta5_6() {
		return pregunta5_6;
	}

	public void setPregunta5_6(RespuestaVO pregunta5_6) {
		this.pregunta5_6 = pregunta5_6;
	}

	public RespuestaVO getPregunta5_7() {
		return pregunta5_7;
	}

	public void setPregunta5_7(RespuestaVO pregunta5_7) {
		this.pregunta5_7 = pregunta5_7;
	}

	public RespuestaVO getPregunta5_8() {
		return pregunta5_8;
	}

	public void setPregunta5_8(RespuestaVO pregunta5_8) {
		this.pregunta5_8 = pregunta5_8;
	}

	public RespuestaVO getPregunta5_9() {
		return pregunta5_9;
	}

	public void setPregunta5_9(RespuestaVO pregunta5_9) {
		this.pregunta5_9 = pregunta5_9;
	}

	public RespuestaVO getPregunta5_10() {
		return pregunta5_10;
	}

	public void setPregunta5_10(RespuestaVO pregunta5_10) {
		this.pregunta5_10 = pregunta5_10;
	}

	public RespuestaVO getPregunta6_1() {
		return pregunta6_1;
	}

	public void setPregunta6_1(RespuestaVO pregunta6_1) {
		this.pregunta6_1 = pregunta6_1;
	}

	public RespuestaVO getPregunta6_2() {
		return pregunta6_2;
	}

	public void setPregunta6_2(RespuestaVO pregunta6_2) {
		this.pregunta6_2 = pregunta6_2;
	}

	public RespuestaVO getPregunta6_3() {
		return pregunta6_3;
	}

	public void setPregunta6_3(RespuestaVO pregunta6_3) {
		this.pregunta6_3 = pregunta6_3;
	}

	public RespuestaVO getPregunta7() {
		return pregunta7;
	}

	public void setPregunta7(RespuestaVO pregunta7) {
		this.pregunta7 = pregunta7;
	}

	public RespuestaVO getPregunta8() {
		return pregunta8;
	}

	public void setPregunta8(RespuestaVO pregunta8) {
		this.pregunta8 = pregunta8;
	}

	public RespuestaVO getPregunta9() {
		return pregunta9;
	}

	public void setPregunta9(RespuestaVO pregunta9) {
		this.pregunta9 = pregunta9;
	}

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FormatoDTO [direccion=" + direccion + ", persona=" + persona + ", general=" + general + ", pregunta1="
				+ pregunta1 + ", pregunta2=" + pregunta2 + ", pregunta3=" + pregunta3 + ", pregunta4_1=" + pregunta4_1
				+ ", pregunta4_2=" + pregunta4_2 + ", pregunta4_3=" + pregunta4_3 + ", pregunta5_1=" + pregunta5_1
				+ ", pregunta5_2=" + pregunta5_2 + ", pregunta5_3=" + pregunta5_3 + ", pregunta5_4=" + pregunta5_4
				+ ", pregunta5_5=" + pregunta5_5 + ", pregunta5_6=" + pregunta5_6 + ", pregunta5_7=" + pregunta5_7
				+ ", pregunta5_8=" + pregunta5_8 + ", pregunta5_9=" + pregunta5_9 + ", pregunta5_10=" + pregunta5_10
				+ ", pregunta6_1=" + pregunta6_1 + ", pregunta6_2=" + pregunta6_2 + ", pregunta6_3=" + pregunta6_3
				+ ", pregunta7=" + pregunta7 + ", pregunta8=" + pregunta8 + ", pregunta9=" + pregunta9 + ", usuario="
				+ usuario + "]";
	}

}
