package org.example;

import org.example.canais.*;
import org.example.enumerated.TiposDeArquivo;
import org.example.menssagen.EnvioMensagem;
import org.example.modelo.MensagemBasica;
import org.example.modelo.MensagemMultimidia;
import org.example.modelo.Video;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dataAtual = new Date();

        MensagemBasica mensagem = new MensagemBasica();
        MensagemMultimidia mensagemMultimidia = new MensagemMultimidia();
        Video mensagemVideo =  new Video();

        WhatsApp whatsApp = new WhatsApp();
        Telegram telegram = new Telegram();
        Instagram instagram = new Instagram();
        Facebook facebook = new Facebook();
        EnvioMensagem canal = CanaisFactory.Create("telegram");

        mensagem.setDataEnvio(dataAtual);
        mensagem.setMensagem("Olá");

        mensagemMultimidia.setArquivo("Documento PDF");
        mensagemMultimidia.setFormato(TiposDeArquivo.PDF);
        mensagemMultimidia.setMensagem("PDF para reunião amanhã");
        mensagemMultimidia.setDataEnvio(dataAtual);

        mensagemVideo.setDataEnvio(dataAtual);
        mensagemVideo.setMensagem("Olá - Mensagem de vídeo");
        mensagemVideo.setArquivo("fim de semana.mp4");
        mensagemVideo.setFormato(TiposDeArquivo.MP3);
        mensagemVideo.setDuracao(60);

        System.out.println("-------------------------------------------------");
        whatsApp.enviarMensagem("+5511964687373", mensagem);
        System.out.println("-------------------------------------------------");
        instagram.enviarMensagem("+5511964687373", mensagemVideo);
        System.out.println("-------------------------------------------------");
        telegram.enviarMensagem("usuário",mensagemMultimidia);
        System.out.println("-------------------------------------------------");
        facebook.enviarMensagem("usuário2",mensagemVideo);
        System.out.println("-------------------------------------------------");
        canal.enviarMensagem("+5511964687373", mensagem);
        System.out.println("-------------------------------------------------");

    }
}