package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio;



import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;

@Repository
public interface ICatalogoRepo extends JpaRepository<Catalogo,BigDecimal> {
	
	@Query(nativeQuery = true,value="	SELECT * FROM CATALOGO where IDESTADO=:idEstado")
	List<Catalogo> getAllActives(@Param("idEstado") String idEstado);	

}
