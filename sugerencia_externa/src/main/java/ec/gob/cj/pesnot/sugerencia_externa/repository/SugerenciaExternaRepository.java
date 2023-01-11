package ec.gob.cj.pesnot.sugerencia_externa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.gob.cj.pesnot.sugerencia_externa.model.SugerenciaExterna;


public interface SugerenciaExternaRepository extends JpaRepository<SugerenciaExterna, Long> {

	
	@Query( value = "SELECT * FROM SUGERENCIAEXTERNA  WHERE (idSugerenciaExterna = ?)",  nativeQuery = true)
	List<SugerenciaExterna> findByIdSugerenciaExterna(@Param("idSugerenciaExterna") Long idInformativo);
}
