package org.example.num2;

public class Pessoa {
    private String nome;
    private Integer id;
    private Integer idade;
    static private Integer idIndex = 1;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.id =  idIndex;
        this.idade = idade;
        idIndex++;
    }

}
