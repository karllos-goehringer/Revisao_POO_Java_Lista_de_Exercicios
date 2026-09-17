package org.example.num6;

public class Retangulo extends FormaGeometrica{
    private Double base;
    private Double altura;

    public Retangulo(String nome, Double base, Double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    Double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
