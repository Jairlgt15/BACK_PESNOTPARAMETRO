package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio;



import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;

@Repository
public interface ICatalogoRepo extends JpaRepository<Catalogo,Long> {
	
	@Query(nativeQuery = true,value="SELECT * FROM CATALOGO where ESTADOACTIVO='true'")
	List<Catalogo> getAllActives();
	
	@Query(nativeQuery = true,value="SELECT * FROM CATALOGO c WHERE c.nombreCatalogo LIKE :nombre%")
	List<Catalogo> getCatalogosLike(@Param("nombre") String nombre);
	

}
