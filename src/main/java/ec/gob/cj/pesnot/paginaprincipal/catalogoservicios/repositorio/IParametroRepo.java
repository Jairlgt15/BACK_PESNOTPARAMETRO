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
	
	@Query(nativeQuery =true,value = "SELECT * FROM PARAMETROCATALOGO p where p.idcatalogo = :idCatalogo and p.ESTADOACTIVO=1 and p.ESTADOPARAMETROCATALOGO=1;")
	List<Parametro> getParametrosByCatalogo(@Param("idCatalogo") String idCatalogo);
	
	@Query(nativeQuery = true,value="SELECT * FROM PARAMETROCATALOGO p WHERE p.NOMBREPARAMETRO LIKE :nombre%")
	List<Parametro> getParametrosLike(@Param("nombre") String nombre);
	
	@Query(nativeQuery = true,value="select FECHAINICIOPARAMETROCATALOGO,NOMBREPARAMETRO, CASE WHEN ESTADOACTIVO=0 THEN 'Eliminacion' WHEN NUMEROVERSIONPARAMETROCATALOGO=1 THEN 'Creacion' WHEN NUMEROVERSIONPARAMETROCATALOGO<>1 THEN 'Modificacion' ELSE '' END AS Accion from parametro")
	List getBitacora();
	



}
