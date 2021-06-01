package br.sampaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class JogoXadrezTest {

    @Test
    void calculaTempoJogo(){
        //arranje
        JogoXadrez jogo1 = new JogoXadrez(10);

        //act
      Integer tempoJogo = jogo1.tempoJogo(24);

        //assertions
        Assertions.assertEquals(14,tempoJogo);

    }

}