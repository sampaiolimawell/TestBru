package br.sampaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

class JogoXadrezTest {

    @Test
    void calculaTempoJogo(){
        //arranje
        JogoXadrez jogo1 = new JogoXadrez(Instant.parse("2017-10-03T10:00:00.00Z"));

        //act
        Duration tempoJogo = jogo1.tempoJogo(Instant.parse("2017-10-03T20:00:00.00Z"));

        //assertions
        Assertions.assertEquals(Duration.parse("PT10H"),tempoJogo);

    }

}