package org.example;

import org.example.num1.TesteAnimais;
import org.example.num3.TesteProduto;
import org.example.num4.Funcionario;
import org.example.num4.Gerente;
import org.example.num6.TesteFormasGeometricas;
import org.example.num7.TesteIPagavel;
import org.example.num8.TesteNotificacao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TesteAnimais teste = new TesteAnimais();
        TesteProduto testeprodutos = new TesteProduto();
        TesteIPagavel testeInterface = new TesteIPagavel();
        TesteFormasGeometricas testeFormas = new TesteFormasGeometricas();
        TesteNotificacao testenoticacoes = new TesteNotificacao();
        teste.TestarSom();
        testeprodutos.teste();
        testeFormas.rodarTeste();
        testeInterface.TestarPagamento();
        testenoticacoes.teste();
    }
    }
