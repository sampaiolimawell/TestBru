package br.sampaio;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.Period;

public class JogoXadrez {

    private Integer inicioJogo;

    private Integer fimJogo;

    public JogoXadrez(Integer inicioJogo) {
        this.inicioJogo = inicioJogo;

    }

    public Integer getInicioJogo() {
        return inicioJogo;
    }

    public Integer tempoJogo(Integer fimJogo) {
        Integer tempo = fimJogo - inicioJogo;
        return tempo;
    }
}


