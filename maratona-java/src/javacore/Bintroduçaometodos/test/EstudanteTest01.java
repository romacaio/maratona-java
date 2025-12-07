package javacore.Bintroduçaometodos.test;

import javacore.Bintroduçaometodos.dominio.Estudante;
import javacore.Bintroduçaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Midorya";
        estudante01.sexo = 'M';
        estudante01.idade = 15;
        Estudante estudante02 = new Estudante();
        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 16;

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante01);
        System.out.println("--------------");
        impressora.imprime(estudante02);

        System.out.println("######################");
        impressora.imprime(estudante01);
        System.out.println("--------------");
        impressora.imprime(estudante02);
    }
}
