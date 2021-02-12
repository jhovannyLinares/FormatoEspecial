package mx.formato.presentacion.web.config.security.web.authentication;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import mx.formato.persistencia.entidades.Usuario;
import mx.formato.persistencia.repositorio.IUsuarioRepository;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	
	@Autowired
	private IUsuarioRepository repository;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		HttpSession session = request.getSession();

		User authUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		List<Usuario> usuario = repository.findByNombre(authUser.getUsername());
		
		session.setAttribute("username", authUser.getUsername());
		session.setAttribute("idUser",usuario.get(0).getId());
		
		session.setAttribute("authorities", authentication.getAuthorities());

		// set our response to OK status
		response.setStatus(HttpServletResponse.SC_OK);

		String url = "./formulario/pagina1";

		response.sendRedirect(url);
	}
}
