package br.sampaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    @Test
    void testeSalarioFinal(){
        //arranje
        Vendedor vendedor1 = new Vendedor("Wellington",2000d,100d,
                10);
        //act
        Double salarioFinal = vendedor1.salarioFinalVendedor();

        //assert
        Assertions.assertEquals(3050,salarioFinal);
    }




}