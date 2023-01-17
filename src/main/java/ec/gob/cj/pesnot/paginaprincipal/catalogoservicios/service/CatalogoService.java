package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;



@Service
public class CatalogoService {
	@Autowired
	ICatalogoRepo icatalagoDAO;

	public List<Catalogo> listarCatalogos() {
		return icatalagoDAO.findAll();
	}

	public Catalogo guardarCatalogo(Catalogo catalogoEntrante) {
		return icatalagoDAO.save(catalogoEntrante);
	}


	public Optional<Catalogo> catalogoById(Long idEntrante) {
		//El opcional me maneja si es que no encuentra nada
		Optional <Catalogo> catalogo = icatalagoDAO.findById(idEntrante);
		//.orElseThrow(()-> new CatalogoNotFoundException(idEntrante.toString()));
		return catalogo;
	}

	public Catalogo actualizar(Catalogo catalagoAActualizar) {
		// TODO Auto-generated method stub
		return null;
	}

	 public boolean eliminar(Long idClienteAEliminar) {
        try{
          icatalagoDAO.deleteById(idClienteAEliminar);
            return true;
        }catch(Exception err){
            return false;
        }
    }
	public List<Catalogo> listarCatalogosActivos(){
		return icatalagoDAO.getAllActives();
	}
	 public List<Catalogo> getCatalogosLike(String idCatalogo){
		 List<Catalogo> listaLikeCatalogo = new ArrayList<>();
		 listaLikeCatalogo=icatalagoDAO.getCatalogosLike(idCatalogo);
		 return listaLikeCatalogo;
		 
	 }
	 
	 public Catalogo getCatalogoNombre(String nombre){
		
		 Catalogo catalogoNombre=icatalagoDAO.getCatalogoByNombre(nombre);
		 return catalogoNombre;
		 
	 }
	

}
