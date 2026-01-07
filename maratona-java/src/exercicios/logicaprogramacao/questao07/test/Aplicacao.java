package exercicios.logicaprogramacao.questao07.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor booleano: ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Entre com o segundo valor booleano: ");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos valores são VERDADEIROS");

        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSOS");

        } else {
            System.out.println("Possuem valores lógicos diferentes");
        }

        sc.close();
    }
}
