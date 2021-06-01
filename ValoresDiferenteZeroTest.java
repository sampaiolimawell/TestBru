package br.sampaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValoresDiferenteZeroTest {

    @Test
    void testeDivisao(){
        //arranje
        ValoresDiferenteZero valores = new ValoresDiferenteZero(10d,2d);

        //act
        Double divisao = valores.funcao();

         // assert
        Assertions.assertEquals(5, divisao);
    }

}