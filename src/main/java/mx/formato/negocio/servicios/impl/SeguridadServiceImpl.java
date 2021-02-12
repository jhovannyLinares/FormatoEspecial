package mx.formato.negocio.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.formato.negocio.servicios.ISeguridadService;
import mx.formato.persistencia.repositorio.IUsuarioRepository;

@Service
public class SeguridadServiceImpl implements ISeguridadService {

	@Autowired
	IUsuarioRepository usuario;

	@Override
	public String login() {
		return "Seguridad/login";
	}

}
