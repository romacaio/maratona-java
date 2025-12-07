package javacore.Bintroduçaometodos.test;

import javacore.Bintroduçaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        estudante01.nome = "Midorya";
        estudante01.sexo = 'M';
        estudante01.idade = 15;

        Estudante estudante02 = new Estudante();
        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 16;

        estudante01.imprime();
        estudante02.imprime();
    }
}
