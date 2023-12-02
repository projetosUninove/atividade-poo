package org.example.canais;

import org.example.canais.CanaisMensagem;

public class Facebook extends CanaisMensagem {

    @Override
    protected String getCanal() {
        return "Facebook";
    }
}
