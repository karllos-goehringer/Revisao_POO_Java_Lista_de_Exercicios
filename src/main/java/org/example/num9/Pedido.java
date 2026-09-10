package org.example.num9;

public class Pedido {
    private Double valorTotal;
    private Integer id;
    private CalculadoraDesconto calculadoraDeDesconto;
    public Pedido(Double valorTotal, CalculadoraDesconto calculadoraDeDesconto) {
        valorTotal = valorTotal;
        this.calculadoraDeDesconto = calculadoraDeDesconto;
    }
    Double calcularValorTotalFinal(Double valorTotal){
        return calculadoraDeDesconto.aplicarDesconto(valorTotal);
    }
}
