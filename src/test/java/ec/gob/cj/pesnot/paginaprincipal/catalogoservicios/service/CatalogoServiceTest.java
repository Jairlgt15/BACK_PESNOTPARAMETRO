package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.BackParametrosApplication;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.controlador.CatalogoControlador;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
//debemos mapear la clase a public para hacer el ejecutable
@SpringBootTest
public class CatalogoServiceTest {

    @Autowired
    @Spy
    private ICatalogoRepo repo = Mockito.mock(ICatalogoRepo.class);
    @Autowired
    @Spy
    private CatalogoService repoS = Mockito.mock(CatalogoService.class);
    @Autowired
    @Spy
    private CatalogoControlador contR= Mockito.mock(CatalogoControlador.class);
    @Mock
	private SpringApplicationBuilder springApplicationBuilder;
   


    
    
    
    //antes de cada test
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    
    @Test
	   public void main() {
    	BackParametrosApplication.main(new String[] {});
	   }
	
	@Test
	  public void testIt() {
		BackParametrosApplication notificacionesApplication = new BackParametrosApplication();
	    when(springApplicationBuilder.sources(BackParametrosApplication.class)).thenReturn(springApplicationBuilder);

	    SpringApplicationBuilder result = notificacionesApplication.configure(springApplicationBuilder);

	    verify(springApplicationBuilder).sources(BackParametrosApplication.class);
	    assertEquals(springApplicationBuilder,result);
	  }



    @Test
    @DisplayName("Debe pasar cuando se obtenga una lista de catalogos no sea nulo")
    void listarCatalogos() {

        List <Catalogo> listaCatalogosActual= repo.findAll();
        //el assert crea un valor esperado
        System.out.println(listaCatalogosActual);
        assertNotNull(listaCatalogosActual);
    }

    @Test
    @DisplayName("Debe pasar cuando el catalago sea guardado, consecuentemente no debe ser null")
    void guardarCatalogo() {
        Catalogo catalogo= new Catalogo("provincia",true,true);
        Catalogo actual= repo.save(catalogo);
        actual.setEstadoActivo(false);
        actual.setEstadoCatalogo(false);
        actual.setNombre("canton");
        actual.setId((long) 9);
        assertThat(actual).isNotNull();
    }

    @Test
    @DisplayName("Debe pasar cuando el catalago con id sea recuperado")
    void catalogoById() {
        Catalogo catalogo= new Catalogo("EstadoCivil",true,true);
        Catalogo actual= repo.save(catalogo);
 
        Long numeroD=actual.getId();
        String nombre= catalogo.getNombre();

        assertThat(repo.findById(numeroD)).isNotNull();
    }

    @Test
    @DisplayName("Debe pasar cuando cada elemento de la lista tiene verdadero en el atributo 'activo'")
    void listarCatalogosActivos() {
        List <Catalogo> listaCatalogosActual= repo.getAllActives();
        //el assert crea un valor esperado
        for(Catalogo catalogo:listaCatalogosActual){
            assertThat(catalogo.isEstadoActivo()).isTrue();
            assertThat(catalogo.isEstadoCatalogo()).isTrue();
        }

        assertNotNull(listaCatalogosActual);
    }
    @Test
    @DisplayName("PruebaServicio")
    void listarServicio() {
    	Catalogo catalogo = new Catalogo();
    	List <Catalogo> listaCatalogosActual= repoS.listarCatalogos();
    	assertNotNull(listaCatalogosActual);
    	repoS.actualizar(null);
    	repoS.catalogoById((long) 1);
    	repoS.getCatalogosLike(null);
    	repoS.listarCatalogosActivos();
    	repoS.guardarCatalogo(catalogo);
    }
    @Test
    @DisplayName("PruebaControlador")
    void listarControlador() {
     	Catalogo catalogo = new Catalogo();
    	contR.listarCatalogos();
    	contR.listarCatalogosActivos();
    	contR.guardarActos(catalogo);
    	contR.obtenerCatalogosPorId((long) 1);
    	contR.obtenerActosLike("caca");
    	
    	}
    
}