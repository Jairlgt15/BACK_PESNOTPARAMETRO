package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.controlador;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service.ParametroService;

@RestController
@RequestMapping("/Parametro")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class ParametroControlador {
	
	@Autowired
	ParametroService parametroSrvicesImp;

	@GetMapping("/parametros")
	public List<Parametro> listarCatalogos() {
		return parametroSrvicesImp.listarParametro();
	}

	@PostMapping("/save")
	public Parametro guardarActos(@RequestBody Parametro objParametro) {

		return parametroSrvicesImp.guardarParametro(objParametro);
	}

	@GetMapping("/parametros/{id}")
	public Optional<Parametro> obtenerParametroById(@PathVariable("id") Long id) {
		return parametroSrvicesImp.parametroById(id);
	}
	@GetMapping("/parametros/like/{nombre}")
	public List<Parametro> getParametrosLike(@PathVariable ("nombre") String nombre) {
		return parametroSrvicesImp.getParametrosLike(nombre);
	}
	@GetMapping("/parametros/Catalogo/{nombre}")
	public List<Parametro> getParametrosByCatalogo(@PathVariable ("nombre") String id) {
		return parametroSrvicesImp.getParametrosByCatalogo(id);


	}


	@DeleteMapping("/parametros/eliminar/{id}")
	    public String eliminarPorId(@PathVariable("id") Long id){
	        boolean ok = parametroSrvicesImp.eliminar(id);
	        if (ok){
	            return "Se eliminó el usuario con id " + id;
	        }else{
	            return "No pudo eliminar el usuario con id" + id;
	        }   
	        }

	
}