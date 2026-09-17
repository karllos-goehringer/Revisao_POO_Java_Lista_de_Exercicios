package org.example.num8;

import java.util.ArrayList;
import java.util.List;

public class TesteNotificacao {
    public List<Notificavel> lista = new ArrayList<>();

    public void criarNotificacao(){
        NotificacaoEmail notificacao = new NotificacaoEmail("karlloshmg@gmail.com","Olá email");
        NotificacaoTelefone notificacaoTel = new NotificacaoTelefone("27996107755","Olá telefone.");
        lista.add(notificacao);
        lista.add(notificacaoTel);

    }
    public void teste(){
        criarNotificacao();
        for (int i = 0; i < lista.toArray().length; i++) {
            System.out.println(lista.get(i).enviarUrgente("URGENTE! MEU DEUS!"));
        }
    }
}
