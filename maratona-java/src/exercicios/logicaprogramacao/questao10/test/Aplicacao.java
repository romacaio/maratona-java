package exercicios.logicaprogramacao.questao10.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Entre com sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Entre com sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Entre com sua terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Entre com sua quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String mensagem = String.format("%s sua média foi %.1f. você está: %s", nome, media, media >= 70 ? "Aprovado!" : "Reprovado!");

        System.out.println(mensagem);

        sc.close();

    }
}
