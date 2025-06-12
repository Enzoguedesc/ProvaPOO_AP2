package model;

public class Sala extends Local {

    private int numeroSala;
    private boolean possuiMultimida;

    public Sala(String nome, int capacidade, String bloco, int numeroSala, boolean possuiMultimida) {
        super(nome, capacidade, bloco);
        this.numeroSala = numeroSala;
        this.possuiMultimida = possuiMultimida;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean getPossuiMultimida() {
        return possuiMultimida;
    }

    public void setPossuiMultimida(boolean possuiMultimida) {
        this.possuiMultimida = possuiMultimida;
    }

}
