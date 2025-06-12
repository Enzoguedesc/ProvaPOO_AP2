package model;

import java.util.HashSet;
import java.util.Set;

public abstract class Local {
    private String nome;
    private int capacidade;
    private String bloco;
    private Set<Eventos> eventos = new HashSet<Eventos>();  // Local pode ter vários eventos

    public Local(String nome, int capacidade, String bloco) {
        this.eventos = new HashSet<Eventos>();
        this.nome = nome;
        this.capacidade = capacidade;
        this.bloco = bloco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public Set<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(Set<Eventos> eventos) {
        this.eventos = eventos;
    }

    public void addEvento(Eventos evento) {
        this.eventos.add(evento);
    }

    public void removeEvento(Eventos evento) {
        this.eventos.remove(evento);
    }
}
