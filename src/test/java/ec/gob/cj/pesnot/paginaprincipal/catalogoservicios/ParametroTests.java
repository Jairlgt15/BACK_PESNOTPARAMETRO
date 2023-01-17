package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios;
/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.IParametroRepo;


@SpringBootTest
public class ParametroTests {
	@Autowired
	private IParametroRepo parametroRepo;
	@Test
	public void testGuardarParametro() {
	
		Parametro parametro = new Parametro();
		parametro.setNombreParametro("Retencion");
		parametro.setNumero(5l);
		parametro.setFecha(new Date());
		parametro.setFechaInicio(new Date());
		parametro.setFechaFin(new Date());
		parametro.setIdParametro(1l);
	
		
		Parametro parametroGuardado = parametroRepo.save(parametro);

		assertNotNull(parametroGuardado);
	}
	
	@Test
	public void testBuscarParametroPorId() {
		Long numeroD = 1l;
		
		Optional<Parametro> parametro = parametroRepo.findById(numeroD);

		assertThat(parametro.get().getIdParametro()).isEqualTo(numeroD);

	}
	@Test
	public void testListarParametros() {
		List<Parametro> parametros = parametroRepo.findAll();
		assertThat(parametros).size().isGreaterThan(0);
	}
	

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
	 */
	
