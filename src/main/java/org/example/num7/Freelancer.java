package org.example.num7;

public class Freelancer implements IPagavel{
    private String nome;
    private Double valorHora;
    private String funcao;
    private Integer horaTrabalhadas;

    public Freelancer(String nome, Double valorHora, String funcao, Integer horaTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.funcao = funcao;
        this.horaTrabalhadas = horaTrabalhadas;
    }

    public Double calcularPagamento() {
        return horaTrabalhadas * valorHora;
    }
}
