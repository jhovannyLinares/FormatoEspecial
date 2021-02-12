package mx.formato.presentacion.web.config.authentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mx.formato.negocio.util.Md5;
import mx.formato.persistencia.entidades.Usuario;
import mx.formato.persistencia.repositorio.IUsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	IUsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {

		UserBuilder builder = null;

		List<Usuario> usuarios = usuarioRepository.findByNombre(nombre);

		if (usuarios != null) {
			Usuario usuario;
			try {
				usuario = usuarioRepository.findByNombre(nombre).get(0);
			} catch (Exception e) {
				throw new BadCredentialsException("usernameNotFound");
			}
			builder = User.withUsername(nombre);
			builder.password(usuario.getPaswword());

			// Todo:Rol temporal
			builder.roles("USER");

			return builder.build();

		} else {
			throw new BadCredentialsException("usernameNotFound");
		}

	}

}