package org.example.canais;

import org.example.canais.CanaisMensagem;

public class Telegram extends CanaisMensagem {

    @Override
    protected String getCanal() {
        return "Telegram";
    }
}
