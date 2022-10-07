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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParametroServiceTest {
    @Autowired
    private final IParametroRepo repo = Mockito.mock(IParametroRepo.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Debe pasar cuando se obtenga una lista de catalogos mayor a 0")
    void listarParametro() {
        List<Parametro> listaParametroActual= repo.findAll();
        assertNotNull(listaParametroActual);
        assertThat(listaParametroActual).size().isGreaterThan(0);
    }

    @Test
    @DisplayName("Debe pasar cuando al guardar el parametro no sea null")
    void guardarParametro() {
        Date fecha = new Date();
        //date en java es similar a Datetime en sql
        System.out.println(fecha);
        Parametro parametro= new Parametro(1l,2l,"nuevo",fecha,fecha,null,true,true,"Nuevo",2l );
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
    @DisplayName("Debe pasar cuando se obtenga todo los paramateros a partir de un id de catalogo")
    void getParametrosByCatalogo() {
        Number numero = 5;
        List<Parametro> listaByCatalogo =repo.getParametrosByCatalogo(numero.toString());
        assertThat(listaByCatalogo).isNotNull();
    }
}