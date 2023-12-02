package org.example.modelo;

import org.example.enumerated.TiposDeArquivo;

public class MensagemMultimidia extends MensagemBasica{

    private String arquivo;
    private TiposDeArquivo formato;

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public TiposDeArquivo getFormato() {
        return formato;
    }

    public void setFormato(TiposDeArquivo formato) {
        this.formato = formato;
    }
}
