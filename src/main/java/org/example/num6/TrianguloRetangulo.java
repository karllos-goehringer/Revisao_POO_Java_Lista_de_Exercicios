package org.example.num6;

public class TrianguloRetangulo extends FormaGeometrica{
    private Double cateto1;
    private Double cateto2;

    public TrianguloRetangulo(String nome, Double cateto1, Double cateto2) {
        super(nome);
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    @Override
    Double calcularArea() {
        return (cateto1 * cateto2)/2;
    }

    @Override
    public String toString() {
        return "TrianguloRetangulo{" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                '}';
    }
}
