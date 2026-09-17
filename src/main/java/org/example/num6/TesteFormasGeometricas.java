package org.example.num6;


import java.util.ArrayList;
import java.util.List;

public class TesteFormasGeometricas {
    public List<FormaGeometrica> lista = new ArrayList<>();
    public void adicionarNaLista(FormaGeometrica formaGeometrica){
        this.lista.add(formaGeometrica);
    }
    public void criarFormasGemetricas(){
        var triangulo = new TrianguloRetangulo("Triangulo",10.00,8.00);
        var quadrado = new Quadrado("Quadrado", 4.00,4.00);
        var retangulo = new Retangulo("Retangulo",10.00,7.50);
        var circulo = new Circulo("Retangulo", 15.00);
        this.adicionarNaLista(retangulo);
        this.adicionarNaLista(quadrado);
        this.adicionarNaLista(circulo);
        this.adicionarNaLista(triangulo);
    }
    public Double somaTotalAreaLista(){
        Double totalArea = 0.0;
        for (int i = 0; i < lista.toArray().length; i++) {
            totalArea =+ lista.get(i).calcularArea();
        }
        return totalArea;
    }
    public void rodarTeste(){
        this.criarFormasGemetricas();
        System.out.println(this.lista.toString());
        var somaArea = this.somaTotalAreaLista();
        System.out.println(somaArea);
    }

}
