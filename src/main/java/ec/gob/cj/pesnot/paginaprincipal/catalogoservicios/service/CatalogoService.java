package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;



@Service
public class CatalogoService {
	@Autowired
	ICatalogoRepo icatalagoDAO;

	public List<Catalogo> listarCatalogos() {
		return icatalagoDAO.findAll();
	}
	 public List<Catalogo> getCatalogosLike(String nombre) {
			
			
			List<Catalogo> listaLike = new ArrayList<>();
			
			listaLike=icatalagoDAO.getCatalogosLike(nombre);
			
			return listaLike;
			
		}

	public Catalogo guardarCatalogo(Catalogo catalogoEntrante) {
		return icatalagoDAO.save(catalogoEntrante);
	}


	public Optional<Catalogo> catalogoById(BigDecimal idEntrante) {
		//El opcional me maneja si es que no encuentra nada 
		
		return icatalagoDAO.findById(idEntrante);
	}

	public Catalogo actualizar(Catalogo catalagoAActualizar) {
		// TODO Auto-generated method stub
		return null;
	}

	 public boolean eliminar(BigDecimal idClienteAEliminar) {
        try{
          icatalagoDAO.deleteById(idClienteAEliminar);
            return true;
        }catch(Exception err){
            return false;
        }
    }
	public List<Catalogo> listarCatalogosActivos(String idEstado){
		return icatalagoDAO.getAllActives(idEstado);
	}
	

}
