package org.example.num6;

public class Quadrado extends FormaGeometrica{
    private Double lado1;
    private Double lado2;

    public Quadrado(String nome, Double lado1, Double lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    Double calcularArea() {
        return lado1 * lado2;
    }
}
