package model;

import java.util.HashSet;
import java.util.Set;

public class Palestras extends Eventos{

    private String nomePalestrante;
    private String emailPalestrante;
    private String instituicao;
    private Organizador organizadores;
    private Set<Participante> participantes;


    public Palestras(String nome, String data, Local local, int duracaoHoras, double orcamento, String nomePalestrante, String emailPalestrante, String instituicao) {
        super(nome, data, local, duracaoHoras, orcamento);
        this.participantes = new HashSet<Participante>();
        this.nomePalestrante = nomePalestrante;
        this.emailPalestrante = emailPalestrante;
        this.instituicao = instituicao;
        this.organizadores = organizadores;
    }

    public String getNomePalestrante() {
        return nomePalestrante;
    }

    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
    }

    public String getEmailPalestrante() {
        return emailPalestrante;
    }

    public void setEmailPalestrante(String emailPalestrante) {
        this.emailPalestrante = emailPalestrante;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }


    public void addOrganizador(Organizador organizador1) {
    }


    public void addSala(Sala sala2) {
    }

    public Organizador getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(Organizador organizadores) {
        this.organizadores = organizadores;
    }

    @Override
    public Set<Participante> getParticipantes() {
        return participantes;
    }

    @Override
    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public void addParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public void removeParticipante(Participante participante) {
        this.participantes.remove(participante);
    }
}
