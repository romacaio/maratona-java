package exercicios.exceptions.questao03.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("## DIVISÃO ##");
        System.out.println("Digite o primeiro numero da divisão:");
        int num1 = sc.nextInt();

        try {
            System.out.println("Digite o segundo numero da divisão:");
            int num2 = sc.nextInt();
            System.out.println("Resultado: " + num1 / num2);

        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitido!");

        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }

    }
}
