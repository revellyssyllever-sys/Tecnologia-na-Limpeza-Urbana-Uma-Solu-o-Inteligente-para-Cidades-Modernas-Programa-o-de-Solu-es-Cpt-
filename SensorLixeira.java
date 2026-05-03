package model;

public class SensorLixeira {
    private int nivelLixo;
    private String localizacao;
    private boolean cheia;

    public SensorLixeira(int nivelLixo, String localizacao) {
        this.nivelLixo = nivelLixo;
        this.localizacao = localizacao;
        this.cheia = nivelLixo >= 80;
    }

    public int getNivelLixo() {
        return nivelLixo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isCheia() {
        return cheia;
    }

    public String verificarStatus() {
        return cheia ? "Cheia" : "Disponível";
    }
}