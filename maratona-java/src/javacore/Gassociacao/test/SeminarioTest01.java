package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {

        Local local1 = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("Luffy", 17);
        Professor professor1 = new Professor("Barba Branca", "pirata");
        Aluno[] alunos = {aluno1};
        Seminario seminario1 = new Seminario("Onde achar o One Piece", local1, alunos);
        Seminario[] seminariosDisponiveis = {seminario1};
        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();
    }
}
