package org.example.num9;

public class DescontoPromocao implements CalculadoraDesconto{
    @Override
    public double aplicarDesconto(Double valor) {
        return valor - valor * 0.15;
    }
}
