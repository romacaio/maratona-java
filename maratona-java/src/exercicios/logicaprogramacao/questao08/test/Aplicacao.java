package exercicios.logicaprogramacao.questao08.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Entre com o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Entre com o terceiro valor: ");
        int valor3 = sc.nextInt();

        if (valor1 > valor2) {

            if (valor1 > valor3) {
                System.out.println(valor1);
            }

            if (valor2 > valor3) {
                System.out.println(valor2);
                System.out.println(valor3);
                return;
            }
            System.out.println(valor3);
            System.out.println(valor2);

        } else if (valor3 > valor2) {
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);

        } else {
            System.out.println(valor2);

            if (valor3 > valor1) {
                System.out.println(valor3);
                System.out.println(valor1);

            } else {
                System.out.println(valor1);
                System.out.println(valor3);
            }

        }
        sc.close();
    }
}
