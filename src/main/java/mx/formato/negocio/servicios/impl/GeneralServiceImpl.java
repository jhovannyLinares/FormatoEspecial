package mx.formato.negocio.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mx.formato.negocio.dto.FormatoDTO;
import mx.formato.negocio.servicios.IGeneralService;
import mx.formato.negocio.util.mapper.MapperUtil;
import mx.formato.persistencia.entidades.Direccion;
import mx.formato.persistencia.entidades.DistritoFederal;
import mx.formato.persistencia.entidades.General;
import mx.formato.persistencia.entidades.Persona;
import mx.formato.persistencia.entidades.Pregunta;
import mx.formato.persistencia.entidades.Respuesta;
import mx.formato.persistencia.entidades.Usuario;
import mx.formato.persistencia.repositorio.IDistritoFederalRepository;
import mx.formato.persistencia.repositorio.IGeneralRepository;

@Service
public class GeneralServiceImpl implements IGeneralService {

	protected final Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private IDistritoFederalRepository distritoFederalRepository;

	@Autowired
	private IGeneralRepository repository;

	@Override
	public String getPagina1(Model model) {

		List<DistritoFederal> distritosFederales = distritoFederalRepository.findAll();

		model.addAttribute("distritosFederales", distritosFederales);
		model.addAttribute("formatoDTO", new FormatoDTO());

		return "formulario/pagina1";

	}

	@Override
	public String save(HttpSession session, FormatoDTO dto, RedirectAttributes redirec) {

		Usuario usuario = new Usuario();
		usuario.setId(Long.valueOf(session.getAttribute("idUser").toString()));

		Persona persona = new Persona();
		MapperUtil.map(dto.getPersona(), persona);

		Direccion direccion = new Direccion();
		MapperUtil.map(dto.getDireccion(), direccion);

		direccion.setPersona(persona);
		persona.setDireccion(direccion);

		General general = new General();
		general.setUsuario(usuario);
		general.setPersona(persona);

		List<Respuesta> respuestas = new ArrayList<Respuesta>();

		if (dto.getPregunta1() != null)
			respuestas.add(new Respuesta(dto.getPregunta1().getRespuesta(), new Pregunta(1L), general));

		if (dto.getPregunta2() != null)
			respuestas.add(new Respuesta(dto.getPregunta2().getRespuesta(), new Pregunta(2L), general));

		if (dto.getPregunta3() != null)
			respuestas.add(new Respuesta(dto.getPregunta3().getRespuesta(), new Pregunta(3L), general));

		if (dto.getPregunta4_1() != null)
			respuestas.add(new Respuesta(dto.getPregunta4_1().getRespuesta(), new Pregunta(4L), general));

		if (dto.getPregunta4_2() != null)
			respuestas.add(new Respuesta(dto.getPregunta4_2().getRespuesta(), new Pregunta(4L), general));

		if (dto.getPregunta4_3() != null)
			respuestas.add(new Respuesta(dto.getPregunta4_3().getRespuesta(), new Pregunta(4L), general));

		try {

			if (dto.getPregunta5_1() != null && dto.getPregunta5_1().getRespuesta() != null)
				respuestas.add(new Respuesta("1", Integer.valueOf(dto.getPregunta5_1().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_2() != null && dto.getPregunta5_2().getRespuesta() != null)
				respuestas.add(new Respuesta("2", Integer.valueOf(dto.getPregunta5_2().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_3() != null && dto.getPregunta5_3().getRespuesta() != null)
				respuestas.add(new Respuesta("3", Integer.valueOf(dto.getPregunta5_3().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_4() != null && dto.getPregunta5_4().getRespuesta() != null)
				respuestas.add(new Respuesta("4", Integer.valueOf(dto.getPregunta5_4().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_5() != null && dto.getPregunta5_5().getRespuesta() != null)
				respuestas.add(new Respuesta("5", Integer.valueOf(dto.getPregunta5_5().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_6() != null && dto.getPregunta5_6().getRespuesta() != null)
				respuestas.add(new Respuesta("6", Integer.valueOf(dto.getPregunta5_6().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_7() != null && dto.getPregunta5_7().getRespuesta() != null)
				respuestas.add(new Respuesta("7", Integer.valueOf(dto.getPregunta5_7().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_8() != null && dto.getPregunta5_8().getRespuesta() != null)
				respuestas.add(new Respuesta("8", Integer.valueOf(dto.getPregunta5_8().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_9() != null && dto.getPregunta5_9().getRespuesta() != null)
				respuestas.add(new Respuesta("9", Integer.valueOf(dto.getPregunta5_9().getRespuesta()),
						new Pregunta(5L), general));

			if (dto.getPregunta5_10() != null && dto.getPregunta5_10().getRespuesta() != null)
				respuestas.add(new Respuesta("10", Integer.valueOf(dto.getPregunta5_10().getRespuesta()),
						new Pregunta(5L), general));

		} catch (Exception e) {
			logger.error("Se encontraron caracteres no numericos " + e.getMessage());
		}

		if (dto.getPregunta6_1() != null)
			respuestas.add(new Respuesta(dto.getPregunta6_1().getRespuesta(), new Pregunta(6L), general));

		if (dto.getPregunta6_2() != null)
			respuestas.add(new Respuesta(dto.getPregunta6_2().getRespuesta(), new Pregunta(6L), general));

		if (dto.getPregunta6_3() != null)
			respuestas.add(new Respuesta(dto.getPregunta6_3().getRespuesta(), new Pregunta(6L), general));

		if (dto.getPregunta7() != null)
			respuestas.add(new Respuesta(dto.getPregunta7().getRespuesta(), new Pregunta(7L), general));

		if (dto.getPregunta8() != null)
			respuestas.add(new Respuesta(dto.getPregunta8().getRespuesta(), new Pregunta(8L), general));

		if (dto.getPregunta9() != null)
			respuestas.add(new Respuesta(dto.getPregunta9().getRespuesta(), new Pregunta(9L), general));

		general.setRespuestas(respuestas);

		repository.save(general);

		general.setFolio("FRM-MR-" + general.getId());

		repository.save(general);

		return "redirect:/formulario/registro?folio=" + general.getFolio();
	}

}
