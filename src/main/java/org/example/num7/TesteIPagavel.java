package org.example.num7;

import java.util.ArrayList;
import java.util.List;

public class TesteIPagavel {
    public List<IPagavel> lista = new ArrayList<>();
    public void criarDados(){
        var dados1 = new Funcionario("Roger Guedes","Repositor",2000.00);
        var dados2 = new Freelancer("Laurentino Menezes",15.00,"Repositor",20);
        var dados = new Funcionario("Portinari Hudson","Controlador",4000.00);

        this.adicionarNaLista(dados1);
        this.adicionarNaLista(dados2);
        this.adicionarNaLista(dados);
    }
    public void adicionarNaLista(IPagavel empregado){
        this.lista.add(empregado);
    }
    public void TestarPagamento(){
        this.criarDados();
        Double TotalGeral = 00.00;
        for (int i = 0; i < this.lista.toArray().length; i++) {
            TotalGeral =+ this.lista.get(i).calcularPagamento();
        }
        System.out.println(TotalGeral);
    }
}
