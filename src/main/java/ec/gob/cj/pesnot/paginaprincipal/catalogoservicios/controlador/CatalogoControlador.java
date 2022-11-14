package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.controlador;

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




@RequestMapping("/Catalogo")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
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
		List<Catalogo> result = null;
		result = catalagoSrvicesImp.listarCatalogosActivos();
		return result;
	}

	@PostMapping("/save")
	public Catalogo guardarCatalogo(@RequestBody Catalogo objCatalogo) {

		return catalagoSrvicesImp.guardarCatalogo(objCatalogo);
	}

	@GetMapping("/catalogos/{id}")
	public Optional<Catalogo> obtenerCatalogosPorId(@PathVariable("id") Long id) {
		return catalagoSrvicesImp.catalogoById(id);
	}
	@GetMapping("/catalogos/like/{likeNombre}")
	public List<Catalogo> obtenerActosLikeNombre(@PathVariable("likeNombre") String nombre) {
		return catalagoSrvicesImp.getCatalogosLike(nombre);
	}


}