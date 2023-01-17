package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;

@Repository
public interface IParametroRepo extends JpaRepository<Parametro,Long>{
//	List<Parametro> getfindByNombreActoNotarial(String nombreActoNotarial);
	
	@Query(nativeQuery =true,value = "SELECT * FROM ParametroCatalogo p where p.idCatalogo = :idCatalogo and p.ESTADOACTIVO=1 and p.ESTADOPARAMETROCATALOGO=1;")
	List<Parametro> getParametrosByCatalogo(@Param("idCatalogo") String idCatalogo);
	
	@Query(nativeQuery =true,value = "SELECT TOP 1 * FROM ParametroCatalogo p where p.nombreParametroCatalogo= :nombreParametro ;")
	Parametro getParametrosByNombre(@Param("nombreParametro") String nombreParametro);
	
	@Query(nativeQuery = true,value="SELECT * FROM ParametroCatalogo p WHERE p.descripcionParametroCatalogo LIKE :nombre%")
	List<Parametro> getParametrosLike(@Param("nombre") String nombre);

}
