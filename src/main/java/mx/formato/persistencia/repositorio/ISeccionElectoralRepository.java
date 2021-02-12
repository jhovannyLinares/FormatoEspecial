package mx.formato.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import mx.formato.persistencia.entidades.SeccionElectoral;
@Repository
public interface ISeccionElectoralRepository extends JpaRepository<SeccionElectoral, Long>{

}
