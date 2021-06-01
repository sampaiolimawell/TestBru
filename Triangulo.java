package br.sampaio;

public class Triangulo {

    private Integer lado1;

    private Integer lado2;

    private Integer lado3;

    public Triangulo(Integer lado1, Integer lado2, Integer lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Integer getLado1() {
        return lado1;
    }

    public Integer getLado2() {
        return lado2;
    }

    public Integer getLado3() {
        return lado3;
    }

    public boolean calculoTriangulo(){
        boolean ehtriangulo;
        if ((lado1 + lado2) > lado3 && (lado1 + lado3)> lado2 && (lado2+lado3)> lado1){
            ehtriangulo = true;
        }else{
            ehtriangulo = false;
        }
        return ehtriangulo;
    }
}
