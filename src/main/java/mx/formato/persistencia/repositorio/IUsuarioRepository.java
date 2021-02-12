package mx.formato.persistencia.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import mx.formato.persistencia.entidades.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findByNombre(String nombre);

}
