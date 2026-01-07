package exercicios.logicaprogramacao.questao20.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor: ");
        int valor = sc.nextInt();

        System.out.println("\n## TABUADA DO " + valor + " ##\n");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", valor, i, valor * i);
        }
    }
}
