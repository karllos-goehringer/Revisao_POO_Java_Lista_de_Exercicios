package org.example.num4;

public class Gerente extends Funcionario {
    private Double bonus;
    public Gerente(String nome, Double salario, Double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Bonus: " + bonus + "\n Cargo: org.example.num4.Gerente";
    }
}
