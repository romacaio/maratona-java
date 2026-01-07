package exercicios.logicaprogramacao.questao01.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Entre com o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Entre com o valor de C: ");
        int c = sc.nextInt();

        int soma = a + b;
        System.out.printf("\nSoma: A + B (%d + %d) = %d", a, b, soma);

        if (soma < c) {
            System.out.printf("\nA soma entre A(%d) e B(%d) é menor que C(%d)", a, b, c);
        } else {
            System.out.printf("\nA soma entre A(%d) e B(%d) é maior que C(%d)", a, b, c);
        }
        sc.close();
    }
}
