package org.example.num6;

public class Circulo extends FormaGeometrica{
    private Double raio;
    public Circulo(String nome,Double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
