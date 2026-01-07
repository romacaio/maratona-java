package exercicios.logicaprogramacao.questao04.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = sc.nextInt();

        System.out.printf("Sucessor de %d: %d", num, num + 1);
        System.out.printf("\nAntecessor de %d: %d", num, num - 1);
    }
}
