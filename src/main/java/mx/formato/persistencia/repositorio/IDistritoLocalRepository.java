package mx.formato.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.formato.persistencia.entidades.DistritoFederal;
import mx.formato.persistencia.entidades.DistritoLocal;

@Repository
public interface IDistritoLocalRepository extends JpaRepository<DistritoLocal, Long> {

}
