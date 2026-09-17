package org.example.num6;

public abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

     Double calcularArea() {
        return null;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
