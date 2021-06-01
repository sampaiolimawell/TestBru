package br.sampaio;

import java.time.Duration;
import java.time.Instant;

public class JogoXadrez {

    private Instant inicioJogo;

    private Instant fimJogo;

    public JogoXadrez(Instant inicioJogo) {
        this.inicioJogo = inicioJogo;

    }

    public Instant getInicioJogo() {
        return inicioJogo;
    }

    public Duration tempoJogo(Instant fimJogo) {
        Duration tempo =  Duration.between(inicioJogo, fimJogo);
        return tempo;
    }


}


