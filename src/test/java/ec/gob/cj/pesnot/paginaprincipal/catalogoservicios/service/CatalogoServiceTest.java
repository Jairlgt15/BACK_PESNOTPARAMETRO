package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo.Catalogo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repositorio.ICatalogoRepo;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
//debemos mapear la clase a public para hacer el ejecutable
@SpringBootTest
public class CatalogoServiceTest {

    @Autowired
    private final ICatalogoRepo repo    = Mockito.mock(ICatalogoRepo.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("El test debe pasar cuando se obtenga una lista de catalogos mayor a 0")
    void listarCatalogos() {

        List <Catalogo> listaCatalogosActual= repo.findAll();
        //el assert crea un valor esperado
        System.out.println(listaCatalogosActual);
        assertNotNull(listaCatalogosActual);
        assertThat(listaCatalogosActual).size().isGreaterThan(0);
    }

    @Test
    @DisplayName("Debe pasar cuando el catalago sea guardado, consecuentemente no debe ser null")
    void guardarCatalogo() {
        Catalogo catalogo= new Catalogo("provincia",true,true);
        Catalogo actual= repo.save(catalogo);
        assertThat(actual).isNotNull();
    }

    @Test
    void catalogoById() {
        Number numero = 5;
        Long numeroD = new Long(numero.toString());
        Optional<Catalogo> catalogo = repo.findById(numeroD);
        assertThat(catalogo.get().getId()).isEqualTo(numeroD);
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