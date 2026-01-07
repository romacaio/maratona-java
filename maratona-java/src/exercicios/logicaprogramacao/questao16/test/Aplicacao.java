package exercicios.logicaprogramacao.questao16.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do primeiro lado do triângulo: ");
        double lado1 = sc.nextDouble();

        System.out.println("Entre com o valor do segundo lado do triângulo: ");
        double lado2 = sc.nextDouble();

        System.out.println("Entre com o valor do terceiro lado do triângulo: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É um triângulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("é um triângulo Isósceles");
        } else {
            System.out.println("É um triângulo escaleno");
        }

        sc.close();
    }
}
