package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.IParametroRepo;

@Service
@AllArgsConstructor
public class ParametroService {
	@Autowired
	IParametroRepo iParametroRepo;
	public List<Parametro> listarParametro() {
		return iParametroRepo.findAll();
	}

	public Parametro guardarParametro(Parametro ParametroEntrante) {
		return iParametroRepo.save(ParametroEntrante);
	}


	public Optional<Parametro> parametroById(Long idEntrante) {
		//El opcional me maneja si es que no encuentra nada 
		
		return iParametroRepo.findById(idEntrante);
	}

	public Catalogo actualizar(Parametro parametroAActualizar) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	 public List<Parametro> getParametrosLike(String nombre) {
			
			
			List<Parametro> listaLike = new ArrayList<>();
			
			listaLike=iParametroRepo.getParametrosLike(nombre);
			
			return listaLike;
			
		}
	 public List<Parametro> getParametrosByCatalogo(String idCatalogo){
		 List<Parametro> listaByCatalogo = new ArrayList<>();
		 listaByCatalogo=iParametroRepo.getParametrosByCatalogo(idCatalogo);
		 return listaByCatalogo;
		 
	 }

}
