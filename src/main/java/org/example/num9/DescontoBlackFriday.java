package org.example.num9;

public class DescontoBlackFriday implements CalculadoraDesconto{
    @Override
    public double aplicarDesconto(Double valor) {
        return valor - valor*0.30;
    }
}
