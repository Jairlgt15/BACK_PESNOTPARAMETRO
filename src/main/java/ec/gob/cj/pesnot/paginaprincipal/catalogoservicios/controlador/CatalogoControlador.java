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

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service.CatalogoService;



@RestController
@RequestMapping("/Catalogo")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class CatalogoControlador{
	@Autowired
	CatalogoService catalagoSrvicesImp;

	// trea eb formato json
	@GetMapping("/catalogos")
	public List<Catalogo> listarCatalogos() {
		return catalagoSrvicesImp.listarCatalogos();
	}
	@GetMapping("/catalogosActivos")
	public List<Catalogo> listarCatalogosActivos() {
		return catalagoSrvicesImp.listarCatalogosActivos();
	}

	@PostMapping("/save")
	public Catalogo guardarActos(@RequestBody Catalogo objCatalogo) {

		return catalagoSrvicesImp.guardarCatalogo(objCatalogo);
	}

	@GetMapping("/catalogos/{id}")
	public Optional<Catalogo> obtenerCatalogosPorId(@PathVariable("id") Long id) {
		return catalagoSrvicesImp.catalogoById(id);
	}
	@GetMapping("/catalogos/like/{likeNombre}")
	public List<Catalogo> obtenerActosLike(@PathVariable("likeNombre") String nombre) {
		return catalagoSrvicesImp.getCatalogosLike(nombre);
	}


	@DeleteMapping("/catalogos/eliminar/{id}")
	    public String eliminarPorId(@PathVariable("id") Long id){
	        boolean ok = catalagoSrvicesImp.eliminar(id);
	        if (ok){
	            return "Se eliminó el usuario con id " + id;
	        }else{
	            return "No pudo eliminar el usuario con id" + id;
	        }
	

}
}