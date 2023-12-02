package org.example.canais;

import org.example.menssagen.EnvioMensagem;

public class CanaisFactory {

    public static EnvioMensagem Create(String canal) {
        switch(canal) {
            case "whatsApp":
                return new WhatsApp();
            case "telegram":
                return new Telegram();
            case "facebook":
                return new Facebook();
            case "instagram":
                return new Instagram();
            default:
                return null;
        }
    }

}
