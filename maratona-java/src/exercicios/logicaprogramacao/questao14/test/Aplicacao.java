package exercicios.logicaprogramacao.questao14.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de A: ");
        int valora = sc.nextInt();

        System.out.println("Entre com o valor de B: ");
        int valorb = sc.nextInt();

        int temp = valora;

        valora = valorb;
        valorb = temp;

        System.out.println("Valor A: " + valora);
        System.out.println("Valor B: " + valorb);

        sc.close();

    }
}
