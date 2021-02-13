package mx.formato.negocio.servicios;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import mx.formato.negocio.dto.FormatoDTO;

public interface IGeneralService {

	String getPagina1(Model model);

	String save(HttpSession session, FormatoDTO dto);
}
