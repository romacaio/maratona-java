package exercicios.logicaprogramacao.questao11.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Entre com sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Entre com sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f ", media);

        sc.close();

    }
}

