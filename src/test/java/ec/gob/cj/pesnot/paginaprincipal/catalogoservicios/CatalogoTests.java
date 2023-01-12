package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios;

/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;

@SpringBootTest
public class CatalogoTests {

	@Autowired
	private ICatalogoRepo catalogoRepo;

	@Test
	public void testGuardarCatalogo() {
		Catalogo catalogo = new Catalogo("Porcentajes", true, true);
		catalogo.setNombre(null);
		Catalogo catalagoGuardado = catalogoRepo.save(catalogo);

		assertNotNull(catalagoGuardado);
	}
	
	@Test
	public void testBuscarProductoPorId() {
		Long numero = 5l;
		Optional<Catalogo> catalogo = catalogoRepo.findById(numero);

		assertThat(catalogo.get().getId()).isEqualTo(numero);

	}
	@Test
	public void testListarCatalogos() {
		List<Catalogo> catalogos = catalogoRepo.findAll();
		assertThat(catalogos).size().isGreaterThan(0);
	}
	

	/*
	 * @Test private void testactualizarCatalogo() { String nombreCatalogo =
	 * "Porcentajes"; Catalogo catalogoNuevo = new Catalogo(nombreCatalogo,
	 * "Valores correspondi", 2L); Number numero = 4; BigDecimal numeroD = new
	 * BigDecimal(numero.toString()); catalogoNuevo.setId(numeroD);
	 * 
	 * catalogoRepo.save(catalogoNuevo); Optional<Catalogo> actualizarC =
	 * catalogoRepo.findById(numeroD);
	 * assertThat(actualizarC.get().getNombre()).isEqualTo(nombreCatalogo);
	 * 
	 * }
	 *

	}
	 */
