package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.controlador;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service.ParametroService;

@RequestMapping("/Parametro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ParametroControlador {
	
	@Autowired
	ParametroService parametroSrvicesImp;

	@GetMapping("/parametros")
	public List<Parametro> listarParametros() {
		return parametroSrvicesImp.listarParametro();
	}

	@PostMapping("/save")
	public Parametro guardarParametros(@RequestBody Parametro objParametro) {

		return parametroSrvicesImp.guardarParametro(objParametro);
	}

	@GetMapping("/parametros/{id}")
	public Optional<Parametro> obtenerParametroPorId(@PathVariable("id") Long id) {
		return parametroSrvicesImp.parametroById(id);
	}
	@GetMapping("/parametros/like/{nombre}")
	public List<Parametro> obtenerParametrosLikeNombre(@PathVariable ("nombre") String nombre) {
		return parametroSrvicesImp.getParametrosLike(nombre);
	}
	@GetMapping("/parametros/Catalogo/{nombre}")
	public List<Parametro> obtenerParametrosPorCatalogo(@PathVariable ("nombre") String id) {
		return parametroSrvicesImp.getParametrosByCatalogo(id);
	}

	
}