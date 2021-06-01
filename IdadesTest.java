package br.sampaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdadesTest {

    @Test
    void testeSoma(){
        //aranje
        Idades idades = new Idades(40,50,30,20);

        //act
        Integer somaIdades = idades.somaIdadeHomenMaisMulher();

        //Assert
        Assertions.assertEquals(70,somaIdades);
    }

    @Test
    void testeProduto(){
        //aranje
        Idades idades = new Idades(40,50,30,20);

        //act
        Integer produtoIdades = idades.produtoIdades();

        //Assert
        Assertions.assertEquals(1200,produtoIdades);
    }
}