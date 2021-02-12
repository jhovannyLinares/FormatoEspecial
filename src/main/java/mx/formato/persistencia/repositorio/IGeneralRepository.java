package mx.formato.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.formato.persistencia.entidades.General;

public interface IGeneralRepository extends JpaRepository<General, Long> {

}
