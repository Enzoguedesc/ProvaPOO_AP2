package model;

import java.util.HashSet;
import java.util.Set;

public class Instrutor extends PessoaResponsavel{

    private String formacao;
    private String area;
    private Set<Minicursos> minicursos;

    public Instrutor(String nome, String email, int cpf, String curso, String formacao, String area) {
        super(nome, email, cpf, curso);
        this.formacao = formacao;
        this.area = area;
        this.minicursos = new HashSet<Minicursos>();
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void addMinicursos(Minicursos minicursos) {
        this.minicursos.add(minicursos);
    }

    public void removeMinicursos(Minicursos minicursos) {
        this.minicursos.remove(minicursos);
    }
}
