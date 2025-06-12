package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Minicursos extends Eventos{

    private int cargaHoraria;
    private Set<Instrutor> instrutores;
    private List<String> materias;
    private Set<Organizador> organizadores;


    public Minicursos(String nome, String data, Local local, int duracaoHoras, double orcamento, int cargaHoraria) {
        super(nome, data, local, duracaoHoras, orcamento);
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new HashSet<Instrutor>();
        this.materias = new ArrayList<String>();
        this.organizadores = new HashSet<Organizador>();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Set<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public void addInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public void removeInstrutor(Instrutor instrutor) {
        this.instrutores.remove(instrutor);
    }


    public void addMateria(String materia) {
        this.materias.add(materia);
    }

    public void removeMateria(String materia) {
        this.materias.remove(materia);
    }

    public void setOrganizadores(Set<Organizador> organizadores) {
        this.organizadores = organizadores;
    }

    public void addOrganizador(Organizador organizador) {
        this.organizadores.add(organizador);
    }

    public void removeOrganizador(Organizador organizador) {
        this.organizadores.remove(organizador);
    }


}
