package exercicios.logicaprogramacao.questao22.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor A: ");
        int a = sc.nextInt();

        System.out.println("Entre com o valor B: ");
        int b = sc.nextInt();

        double resto = a % b;
        int quociente = a / b;

        System.out.printf("\nDivisão : %d / %d\nResto = %.2f\nQuociente = %d", a, b, resto, quociente);

        sc.close();
    }
}
