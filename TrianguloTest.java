package br.sampaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void testehtriangulo(){
        //arranje
        Triangulo triangulo = new Triangulo(10,10,10);

        //act
        boolean ehtriangulo = triangulo.calculoTriangulo();

        //assert
        Assertions.assertEquals(true, ehtriangulo);
    }

    @Test
    void testehtrianguloerro(){
        //arranje
        Triangulo triangulo = new Triangulo(10,10,50);

        //act
        boolean ehtriangulo = triangulo.calculoTriangulo();

        //assert
        Assertions.assertEquals(false, ehtriangulo);
    }

}