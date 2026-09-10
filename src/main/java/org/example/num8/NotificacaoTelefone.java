package org.example.num8;

public class NotificacaoTelefone implements Notificavel{
    private String telefone;
    private String mensagem;

    public NotificacaoTelefone(String telefone, String mensagem) {
        this.telefone = telefone;
        this.mensagem = mensagem;
    }
    public String enviarMensgem(String mensagem) {
        return "\n Nova notificação para: " + telefone + "\n Mensagem: " + mensagem;
    }
}
