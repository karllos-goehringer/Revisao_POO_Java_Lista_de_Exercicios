package org.example.num4;

public class Funcionario {
    private String nome;
    private Double salario;
    private Integer id;
    static private Integer idIndexer = 0;
    public Funcionario(String nome,Double salario) {
        this.nome = nome;
        this.salario = salario;
        this.id = idIndexer;
        idIndexer++;
    }

    public Double getSalario() {
        return salario;
    }
    public String toString(){
        return "\n org.example.num4.Funcionario " + id + "\n Nome: " + nome + "\n Salário" + salario;
    }
}
