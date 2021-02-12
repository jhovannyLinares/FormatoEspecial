package mx.formato.presentacion.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mx.formato.negocio.dto.FormatoDTO;
import mx.formato.negocio.servicios.IGeneralService;

@Controller
@RequestMapping(value = "/formulario")
public class GeneralController {

	@Autowired
	private IGeneralService generalService;

	@GetMapping("/pagina1")
	public String pagina1(Model model) {

		return generalService.getPagina1(model);

	}

	@GetMapping("/registro")
	public String getRegistro(Model model) {

		return "formulario/registro";

	}

	@PostMapping("/pagina1")
	public String savePagina1(HttpSession session, @ModelAttribute FormatoDTO dto, final RedirectAttributes redirec) {

		System.out.println(dto.toString());

		return generalService.save(session, dto, redirec);

	}

}
