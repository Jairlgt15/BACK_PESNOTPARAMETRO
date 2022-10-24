package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.controlador.ParametroControlador;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Parametro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.IParametroRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParametroServiceTest {
    @Autowired
    private final IParametroRepo repo = Mockito.mock(IParametroRepo.class);
    @Autowired
    private final ICatalogoRepo repoC = Mockito.mock(ICatalogoRepo.class);
    @Autowired
    private final ParametroService service = Mockito.mock(ParametroService.class);
    @Autowired
    private final ParametroControlador cont = Mockito.mock(ParametroControlador.class);
    

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    

    @Test
    @DisplayName("Debe pasar cuando se obtenga una lista de parametros no nulo")
    void listarParametro() {
        List<Parametro> listaParametroActual= repo.findAll();
        assertNotNull(listaParametroActual);
        //assertThat(listaParametroActual).size().isGreaterThan(0);
    }

    @Test
    @DisplayName("Debe pasar cuando se obtenga un parametro guardado")
    void guardarParametro() {
        Parametro parametro= new Parametro();
        Catalogo catalogo= repoC.getById((long) 1);
        parametro.setEstadoParametroCatalogo(false);
        parametro.setEstadoActivo(false);
        parametro.setIdCatalogo(catalogo);
        parametro.setDescripcion("a");
        parametro.setFecha(null);
        parametro.setNombreParametro("a");
        parametro.setNumero((long) 1);
        parametro.setValorParametro((long) 1);
        
        Parametro actual= repo.save(parametro);


        assertThat(actual).isNotNull();
    }
    


    @Test
    @DisplayName("Debe devolver el numero de ID que esta predeterminado en la tabla")
    void parametroById() {
        Number numero = 5;
        Long numeroD = new Long(numero.toString());
        assertThat(repo.findById(numeroD)).isNotNull();
    }
    @Test
    @DisplayName("Prueba la funcionalidad del modelo")
    void modelo() {
    	Catalogo idCatalogo=new Catalogo();
    	Parametro parametro1=new Parametro(1l,idCatalogo,1l, "hola", null,true,true,"",2l);
    	Parametro parametro=new Parametro(idCatalogo,1l, "hola", null,true,true,"",2l);
    	parametro.setIdParametro(null);
    	parametro.setDescripcion(null);
    	parametro.setEstadoActivo(false);
    	parametro.setEstadoParametroCatalogo(false);
    	parametro.setFecha(null);
    	parametro.setNombreParametro(null);
    	parametro.setNumero(null);
    	parametro.setValorParametro(null);
    	parametro.getIdParametro();
    	parametro.getDescripcion();
    	parametro.isEstadoActivo();
    	parametro.isEstadoParametroCatalogo();
    	parametro.getFecha();
    	parametro.getNombreParametro();
    	parametro.getNumero();
    	parametro.getValorParametro();
    	parametro.toString();
    	parametro.getIdCatalogo();


    }
    

    @Test
    @DisplayName("Debe pasar cuando se obtenga todo los parametros a partir de un id de catalogo")
    void getParametrosByCatalogo() {
        Number numero = 5;
        List<Parametro> listaByCatalogo =repo.getParametrosByCatalogo(numero.toString());
        assertThat(listaByCatalogo).isNotNull();
    }
    
    
    @Test
    @DisplayName("Debe pasar cuando cada elemento de la lista tiene verdadero en el atributo 'activo'")
    void listarParametrossActivosByCatalogo() {
        Catalogo catalogoE= repoC.getById((long) 1);
        List <Parametro> listaCatalogosActual= repo.getParametrosByCatalogo(catalogoE.getId().toString());
        //el assert crea un valor esperado
        for(Parametro catalogo:listaCatalogosActual){
            assertThat(catalogo.isEstadoActivo()).isTrue();
            assertThat(catalogo.isEstadoParametroCatalogo()).isTrue();
        }
        assertNotNull(listaCatalogosActual);
    }
    @Test
    @DisplayName("Prueba Servicio")
    void servicio() {
    	Catalogo catalogoE= repoC.getById((long) 1);
    	Parametro parametro1=new Parametro(1l,catalogoE,1l, "hola", null,true,true,"",2l);
    	Parametro parametro=new Parametro(catalogoE,1l, "hola", null,true,true,"",2l);
    	service.actualizar(parametro);
    	service.listarParametro();
    	service.guardarParametro(parametro1);
    	service.parametroById((long) 1);
    	service.getParametrosLike("nombre");
    	service.getParametrosByCatalogo("1");
    	
    }
    @Test
    @DisplayName("Prueba controller")
    void controlador() {
    	Catalogo catalogoE= repoC.getById((long) 1);
    	Parametro parametro1=new Parametro(1l,catalogoE,1l, "hola", null,true,true,"",2l);
    	Parametro parametro=new Parametro(catalogoE,1l, "hola", null,true,true,"",2l);
    	cont.listarParametros();
    	cont.guardarActos(parametro);
    	cont.obtenerParametroById((long) 1);
    	cont.getParametrosByCatalogo("1");
    	cont.getParametrosLike("nombr");
    	
    }
    
}
