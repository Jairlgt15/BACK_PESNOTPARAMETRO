package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//debemos mapear la clase a public para hacer el ejecutable
public class CatalogoServiceTest {

    private final ICatalogoRepo catalogoRepo= Mockito.mock(ICatalogoRepo.class);

    @BeforeEach
    void setUp() {
        CatalogoService catalogoService = new CatalogoService(catalogoRepo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("El test debe pasar cuando se obtenga una lista de catalogos mayor a 0")
    void listarCatalogos() {

        List <Catalogo> listaCatalogosActual= catalogoRepo.findAll();
        //el assert crea un valor esperado
        assertNotNull(listaCatalogosActual);
    }

    @Test
    @DisplayName("Debe pasar cuando el catalago sea guardado, consecuentemente no debe ser null")
    void guardarCatalogo() {
        Catalogo catalogo= new Catalogo(1l,"provincia",true,true);
        Catalogo actual=catalogoRepo.save(catalogo);
        assertThat(actual).isNotNull();

    }

    @Test
    void catalogoById() {
    }

    @Test
    void actualizar() {
    }

    @Test
    void eliminar() {
    }

    @Test
    void listarCatalogosActivos() {
    }
}