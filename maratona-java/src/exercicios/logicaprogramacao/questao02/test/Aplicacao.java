package exercicios.logicaprogramacao.questao02.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(num + " é par e neutro");
            return;
        }

        if (num % 2 == 0) {
            System.out.print(num + " é par");
            if (num > 0) {
                System.out.print(" e positivo");
            } else {
                System.out.print(" e negativo");
            }
        } else {
            System.out.print(num + " é ímpar");
            if (num > 0) {
                System.out.print(" e positivo");
            } else {
                System.out.println(" e negativo");
            }
        }
        sc.close();
    }
}
