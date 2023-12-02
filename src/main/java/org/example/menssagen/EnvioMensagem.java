package org.example.menssagen;

import org.example.modelo.MensagemBasica;
import org.example.modelo.MensagemMultimidia;
import org.example.modelo.Video;

public interface EnvioMensagem {

    void enviarMensagem(String destinatario, MensagemBasica mensagem);
    void enviarMensagem(String destinatario, MensagemMultimidia mensagem);
    void enviarMensagem(String destinatario, Video mensagem);

}
