package model;

public class Auditorio extends Local{

    private boolean possuiSom;
    private boolean possuiTraducaoSimultanea;

    public Auditorio(String nome, int capacidade, String bloco, boolean possuiSom, boolean possuiTraducaoSimultanea) {
        super(nome, capacidade, bloco);
        this.possuiSom = possuiSom;
        this.possuiTraducaoSimultanea = possuiTraducaoSimultanea;
    }

    public boolean getPossuiSom() {
        return possuiSom;
    }

    public void setPossuiSom(boolean possuiSom) {
        this.possuiSom = possuiSom;
    }

    public boolean getPossuiTraducaoSimultanea() {
        return possuiTraducaoSimultanea;
    }

    public void setPossuiTraducaoSimultanea(boolean possuiTraducaoSimultanea) {
        this.possuiTraducaoSimultanea = possuiTraducaoSimultanea;
    }
}
