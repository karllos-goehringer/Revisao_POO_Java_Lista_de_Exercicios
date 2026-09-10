package org.example.num8;

public interface Notificavel {
    String enviarMensgem(String mensagem);
    default String enviarUrgente(String mensagem){
     return  "[URGENTE]"+ enviarMensgem(mensagem);
    }
}
