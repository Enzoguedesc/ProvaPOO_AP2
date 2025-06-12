package model;

public class Laboratorio extends Local{

    private int numComputadores;
    private String tipo;  // informatica ou quimica

    public Laboratorio(String nome, int capacidade, String bloco, int numComputadores, String tipo) {
        super(nome, capacidade, bloco);
        this.numComputadores = numComputadores;
        this.tipo = tipo;
    }

    public int getNumComputadores() {
        return numComputadores;
    }

    public void setNumComputadores(int numComputadores) {
        this.numComputadores = numComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
