package control;

import model.*;

public class Programa {
    public static void main(String[] args) {

        // SALA
        Sala sala1 = new Sala("Sala 1", 80, "A", 1, true);
        Sala sala2 = new Sala("Sala 2", 100, "B", 2, false);

        // AUDITORIO
        Auditorio auditorio1 = new Auditorio("Auditorio 1", 150, "C", true, true);
        Auditorio auditorio2 = new Auditorio("Auditorio 2", 200, "D", false, false);

        // LABORATORIO
        Laboratorio laboratorio1 = new Laboratorio("Laboratorio 1", 60, "E", 5, "Informatica");
        Laboratorio laboratorio2 = new Laboratorio("Laboratorio 2", 80, "F", 6, "Química");

        // INSTRUTOR
        Instrutor instrutor1 = new Instrutor("Instrutor 1", "exemplo@example.com", 123456, "Engenharia", "Graduado", "Informática");
        Instrutor instrutor2 = new Instrutor("Instrutor 2", "exemplo@example.com", 823495, "Medicina", "Graduado", "Cardiologia");

        // ORGANIZADOR
        Organizador organizador1 = new Organizador("Enzo", "exemplo@example.com", 988789, "ADM", "Coordenador");
        Organizador organizador2 = new Organizador("Bruna", "exemplo@example.com", 37273, "CDIA", "Inspetor");

        // PARTICIPANTE
        Participante participante1 = new Participante("Joaquim", "231435", "exemplo@example.com", "Engenharia");
        Participante participante2 = new Participante("Pedro", "437321", "exemplo@example.com", "Direito");

        // PALESTRA
        Palestras palestra1 = new Palestras("Palestra 1", "01/08/2023", sala1, 2, 1000, "Flavio", "exemplo@example.com", "IFCE");
        Palestras palestra2 = new Palestras("Palestra 2", "02/08/2023", sala2, 3, 1500, "Ana", "exemplo@example.com", "IFCE");

        // MINICURSO
        Minicursos minicurso1 = new Minicursos("Minicurso 1", "01/08/2023", auditorio1, 2, 1000, 80);
        Minicursos minicurso2 = new Minicursos("Minicurso 2", "02/08/2023", auditorio2, 3, 1500, 100);

        // SEMINARIO
        Seminario seminario1 = new Seminario("Seminario 1", "01/08/2023", sala2, 2, 1000, "Direito", "Roberto", "Thiago");
        Seminario seminario2 = new Seminario("Seminario 2", "02/08/2023", sala1, 3, 1500, "Engenharia", "Pedro", "Roberto");


        // Add participantes em palestras
        palestra1.addParticipante(participante1);
        palestra1.addParticipante(participante2);

        // Add participantes em minicursos
        minicurso1.addParticipante(participante1);
        minicurso1.addParticipante(participante2);

        // Add participantes em seminarios
        seminario1.addParticipante(participante1);
        seminario1.addParticipante(participante2);

        // Add instrutores em palestras
        palestra1.addInstrutor(instrutor1);
        palestra1.addInstrutor(instrutor2);

        // Add instrutores em minicursos
        minicurso1.addInstrutor(instrutor1);
        minicurso1.addInstrutor(instrutor2);

        // Add instrutores em seminarios
        seminario1.addInstrutor(instrutor1);
        seminario1.addInstrutor(instrutor2);

        // Add salas em palestras
        palestra1.addSala(sala1);
        palestra1.addSala(sala2);

        // Add organizadores em palestras
        palestra1.addOrganizador(organizador1);
        palestra1.addOrganizador(organizador2);

        // Add organizadores em minicursos
        minicurso1.addOrganizador(organizador1);
        minicurso2.addOrganizador(organizador2);

        // Add organizadores em seminarios
        seminario1.addOrganizador(organizador1);
        seminario2.addOrganizador(organizador2);

        // Add Salas em seminarios
        seminario1.addSala(sala1);
        seminario1.addSala(sala2);



    }
}