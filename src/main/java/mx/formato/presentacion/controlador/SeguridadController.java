package mx.formato.presentacion.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.formato.negocio.servicios.ISeguridadService;

@Controller
@RequestMapping(value = "/seguridad")
public class SeguridadController {

	@Autowired
	ISeguridadService seguridad;

	@GetMapping("/login")
	public String login() {

		return seguridad.login();

	}

}
