package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;

@Repository
public interface IParametroRepo extends JpaRepository<Parametro,Long>{
//	List<Parametro> getfindByNombreActoNotarial(String nombreActoNotarial);
	
	@Query(nativeQuery =true,value = "SELECT * FROM parametro p where p.idcatalogo = :idCatalogo and p.ESTADOACTIVO=1 and p.ESTADOPARAMETROCATALOGO=1;")
	List<Parametro> getParametrosByCatalogo(@Param("idCatalogo") String idCatalogo);
	
	@Query(nativeQuery = true,value="SELECT * FROM parametro p WHERE p.descripcionparametrocatalogo LIKE :nombre%")
	List<Parametro> getParametrosLike(@Param("nombre") String nombre);
	



}
