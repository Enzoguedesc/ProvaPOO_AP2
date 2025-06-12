package model;

import java.util.HashSet;
import java.util.Set;

public class Participante {
        private String nome;
        private String cpf;
        private String email;
        private String curso;
        private Set<Eventos> eventos;

        public Participante(String nome, String cpf, String email, String curso) {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.curso = curso;
            this.eventos = new HashSet<Eventos>();
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

