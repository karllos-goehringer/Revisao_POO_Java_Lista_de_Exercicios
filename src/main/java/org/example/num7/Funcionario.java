package org.example.num7;

public class Funcionario implements IPagavel{
    private String nome;
    private String funcao;
    private Double salario;

    public Funcionario(String nome, String funcao, Double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    @Override
    public Double calcularPagamento() {
        return salario;
    }
}
