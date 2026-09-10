package org.example.num8;

public class NotificacaoEmail implements Notificavel{
    private String email;
    private String mensagem;

    public NotificacaoEmail(String email, String mensagem) {
        this.email = email;
        this.mensagem = mensagem;
    }

    @Override
    public String enviarMensgem(String mensagem) {
        return "\n Nova notificação para: " + email + "\n Mensagem: " + mensagem;
    }
}
