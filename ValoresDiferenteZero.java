package br.sampaio;

public class ValoresDiferenteZero {

    private Double valor1;

    private Double valor2;

    public ValoresDiferenteZero(Double valor1, Double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Double getValor1() {
        return valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public Double funcao() {
        Double divisao = null;
        if (valor2 <= 0) {
            System.out.println("informe um valor diferente de zero para o segundo valor");

        } else {
            divisao = valor1 / valor2;

        }
        return divisao;
    }
}
