package br.sampaio;

public class Vendedor {

    private String funcionario;

    private Double salario;

    private Double comissaoPorCarroVendido;

    private Integer carrosVendidos;


    public Vendedor(String funcionario, Double salario,
                    Double comissaoPorCarroVendido, Integer carrosVendidos) {
        this.funcionario = funcionario;
        this.salario = salario;
        this.comissaoPorCarroVendido = comissaoPorCarroVendido;
        this.carrosVendidos = carrosVendidos;

    }

    public String getFuncionario() {
        return funcionario;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getComissaoPorCarroVendido() {
        return comissaoPorCarroVendido;
    }

    public Integer getCarrosVendidos() {
        return carrosVendidos;
    }


    public Double salarioFinalVendedor(){
        comissaoPorCarroVendido = comissaoPorCarroVendido * carrosVendidos;
        Double valorTotalVendas = (comissaoPorCarroVendido * 5) /100;
        Double salarioFinal = valorTotalVendas + comissaoPorCarroVendido + salario;

        return salarioFinal;
    }
}
