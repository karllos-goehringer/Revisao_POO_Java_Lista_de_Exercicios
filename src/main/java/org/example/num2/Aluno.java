package org.example.num2;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

}
