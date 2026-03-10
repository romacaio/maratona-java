package exercicios.poo.questao09.test;

import exercicios.poo.questao09.model.Aluno;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do Aluno: ");
        String nome = sc.nextLine();
        System.out.println();

        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as notas do trimestre");
            System.out.print("Nota #" + (i + 1) + ": ");
            double nota = sc.nextDouble();
            notas[i] = nota;
            sc.nextLine(); // limpar buffer
        }

        System.out.println();

        Aluno aluno = new Aluno(nome, notas);
        aluno.exibirResultado();
    }
}
