package org.example.canais;

import org.example.menssagen.EnvioMensagem;
import org.example.modelo.MensagemBasica;
import org.example.modelo.MensagemMultimidia;
import org.example.modelo.Video;

public abstract class CanaisMensagem implements EnvioMensagem {
    protected abstract String getCanal();

    @Override
    public void enviarMensagem(String destinatario, MensagemBasica mensagem) {
        System.out.println("Mensagem básica enviada pelo canal: " + getCanal());
        System.out.println("Destinatário: "+ destinatario);
        System.out.println("Mensagem: "+ mensagem.getMensagem());
        System.out.println("Data Envio: "+ mensagem.getDataEnvio());
    }

    @Override
    public void enviarMensagem(String destinatario, MensagemMultimidia mensagem) {
        System.out.println("Mensagem multimidia enviada pelo canal: " + getCanal());
        System.out.println("Destinatário: "+ destinatario);
        System.out.println("Mensagem: "+ mensagem.getMensagem());
        System.out.println("Data Envio: "+ mensagem.getDataEnvio());
        System.out.println("Arquivo: "+ mensagem.getArquivo());
        System.out.println("Tipo Arquivo: "+ mensagem.getFormato());
    }

    @Override
    public void enviarMensagem(String destinatario, Video mensagem) {
        System.out.println("Mensagem video enviada pelo canal: " + getCanal());
        System.out.println("Destinatário: "+ destinatario);
        System.out.println("Mensagem: "+ mensagem.getMensagem());
        System.out.println("Data Envio: "+ mensagem.getDataEnvio());
        System.out.println("Arquivo: "+ mensagem.getArquivo());
        System.out.println("Tipo Arquivo: "+ mensagem.getFormato());
        System.out.println("Duração: "+ mensagem.getDuracao());
    }
}
