package exercicios.logicaprogramacao.questao03.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int a = sc.nextInt();

        System.out.println("Entre com o segundo valor: ");
        int b = sc.nextInt();

        int c = a == b ? a + b : a * b;

        System.out.println(c);

        sc.close();
    }
}
