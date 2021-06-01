package br.sampaio;

public class Idades {

    private Integer idadeHomen1;

    private Integer idadeHomen2;

    private Integer idadeMulher1;

    private Integer idadeMulher2;

    public Idades(Integer idadeHomen1, Integer idadeHomen2, Integer idadeMulher1, Integer idadeMulher2) {
        this.idadeHomen1 = idadeHomen1;
        this.idadeHomen2 = idadeHomen2;
        this.idadeMulher1 = idadeMulher1;
        this.idadeMulher2 = idadeMulher2;
    }

    public Integer getIdadeHomen1() {
        return idadeHomen1;
    }

    public Integer getIdadeHomen2() {
        return idadeHomen2;
    }

    public Integer getIdadeMulher1() {
        return idadeMulher1;
    }

    public Integer getIdadeMulher2() {
        return idadeMulher2;
    }

    public Integer somaIdadeHomenMaisMulher(){
        Integer soma = 0;
        if (idadeHomen1 > idadeHomen2 && idadeMulher1 < idadeMulher2){
             soma = idadeHomen1 + idadeMulher1;
            return soma;
        }else if (idadeHomen1 > idadeHomen2 && idadeMulher2 < idadeMulher1){
            soma = idadeHomen1 + idadeMulher2;
        }else if (idadeHomen2 > idadeHomen1 && idadeMulher1 < idadeMulher2){
            soma = idadeHomen2 + idadeMulher1;
        }else{
            soma = idadeHomen2 + idadeMulher2;
        }
        return soma;
    }

    public  Integer produtoIdades(){
        Integer produto = 0;
        if (idadeHomen1 < idadeHomen2 && idadeMulher1 > idadeMulher2){
            produto = idadeHomen1 * idadeMulher1;
            return produto;
        }else if (idadeHomen1 < idadeHomen2 && idadeMulher2 > idadeMulher1){
            produto = idadeHomen1 * idadeMulher2;
        }else if (idadeHomen2 < idadeHomen1 && idadeMulher1 > idadeMulher2){
            produto = idadeHomen2 * idadeMulher1;
        }else{
            produto = idadeHomen2 * idadeMulher2;
        }
        return produto;
    }
}
