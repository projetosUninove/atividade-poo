package org.example.canais;

import org.example.canais.CanaisMensagem;

public class WhatsApp extends CanaisMensagem {

    @Override
    protected String getCanal() {
        return "WhatsApp";
    }
}
