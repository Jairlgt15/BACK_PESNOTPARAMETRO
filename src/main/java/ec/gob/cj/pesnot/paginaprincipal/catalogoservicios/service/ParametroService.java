package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.IParametroRepo;

@Service
public class ParametroService {
	@Autowired
	IParametroRepo iParametroRepo;
	public List<Parametro> listarParametro() {
		return iParametroRepo.findAll();
	}

	public Parametro guardarParametro(Parametro ParametroEntrante) {
		return iParametroRepo.save(ParametroEntrante);
	}


	public Optional<Parametro> parametroById(BigDecimal idEntrante) {
		//El opcional me maneja si es que no encuentra nada 
		
		return iParametroRepo.findById(idEntrante);
	}

	public Catalogo actualizar(Parametro parametroAActualizar) {
		// TODO Auto-generated method stub
		return null;
	}

	 public boolean eliminar(BigDecimal idClienteAEliminar) {
        try{
          iParametroRepo.deleteById(idClienteAEliminar);
            return true;
        }catch(Exception err){
            return false;
        }
    }
	 
	 public List<Parametro> getParametrosLike(String nombre) {
			
			
			List<Parametro> listaLike = new ArrayList<>();
			
			listaLike=iParametroRepo.getActosLike(nombre);
			
			return listaLike;
			
		}
	 public List<Parametro> getParametrosByCatalogo(String idCatalogo){
		 List<Parametro> listaByCatalogo = new ArrayList<>();
		 listaByCatalogo=iParametroRepo.getParametrosByCatalogo(idCatalogo);
		 return listaByCatalogo;
		 
	 }

}
