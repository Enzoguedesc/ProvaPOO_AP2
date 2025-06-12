package model;

import java.util.HashSet;
import java.util.Set;

public abstract class Eventos {

    private String nome;
    private String data;
    private Local local;
    private int duracaoHoras;
    private double orcamento;
    private Set<Participante> participantes;  // Um evento pode ter vários participantes
    private Set<Instrutor> instrutores;

    public Eventos(String nome, String data, Local local, int duracaoHoras, double orcamento) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.participantes = new HashSet<Participante>();
        this.instrutores = new HashSet<Instrutor>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public void addParticipante(Participante participante) {
        this.participantes.add(participante);
    }
    public void removeParticipante(Participante participante) {
        this.participantes.remove(participante);
    }

    public void addInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public void removeInstrutor(Instrutor instrutor) {
        this.instrutores.remove(instrutor);
    }
}

