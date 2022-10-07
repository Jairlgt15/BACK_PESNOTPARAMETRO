package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service;

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
    private final IParametroRepo repo    = Mockito.mock(IParametroRepo.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("El test debe pasar cuando se obtenga una lista de catalogos mayor a 0")
    void listarParametro() {
        List<Parametro> listaParametroActual= repo.findAll();
        assertNotNull(listaParametroActual);
        assertThat(listaParametroActual).size().isGreaterThan(0);
    }

    @Test
    void guardarParametro() {
        Date fecha = new Date();
        System.out.println(fecha);
        Parametro parametro= new Parametro(1l,2l,"nuevo",new Date(2020-10-20),fecha,fecha,true,true,"Nuevo",2l );
        Parametro actual= repo.save(parametro);
        assertThat(actual).isNotNull();
    }

    @Test
    void parametroById() {
    }

    @Test
    void actualizar() {
    }

    @Test
    void eliminar() {
    }

    @Test
    void getParametrosLike() {
    }

    @Test
    void getParametrosByCatalogo() {
        
    }
}