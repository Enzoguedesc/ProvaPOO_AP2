package model;

import java.util.HashSet;
import java.util.Set;

public class Seminario extends Eventos{

    private String tema;
    private String nomeAluno;
    private String nomeOrientador;
    private Set<Organizador> organizadores;
    private Set<Sala> salas;

    public Seminario(String nome, String data, Local local, int duracaoHoras, double orcamento, String tema, String nomeAluno, String nomeOrientador) {
        super(nome, data, local, duracaoHoras, orcamento);
        this.salas = new HashSet<Sala>();
        this.organizadores = new HashSet<Organizador>();
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public Set<Organizador> getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(Set<Organizador> organizadores) {
        this.organizadores = organizadores;
    }

    public void addOrganizador(Organizador organizador1) {
        this.organizadores.add(organizador1);
    }

    public void removeOrganizador(Organizador organizador1) {
        this.organizadores.remove(organizador1);
    }


    public Set<Sala> getSalas() {
        return salas;
    }

    public void setSalas(Set<Sala> salas) {
        this.salas = salas;
    }

    public void addSala(Sala sala1) {
        this.salas.add(sala1);
    }

    public void removeSala(Sala sala1) {
        this.salas.remove(sala1);
    }
}
