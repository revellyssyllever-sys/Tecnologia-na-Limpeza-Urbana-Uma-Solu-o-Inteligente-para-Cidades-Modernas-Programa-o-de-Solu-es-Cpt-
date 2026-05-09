package model;

public class SensorLixeira {
    private int id;
    private String localizacao;
    private int nivel;

    public SensorLixeira(int id, String localizacao, int nivel) {
        this.id = id;
        this.localizacao = localizacao;
        this.nivel = nivel;
    }

    public String verificarStatus() {
        if (nivel >= 80) return "CHEIA";
        if (nivel >= 50) return "QUASE CHEIA";
        return "DISPONIVEL";
    }
}