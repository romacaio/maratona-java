package exercicios.logicaprogramacao.questao06.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor qualquer: ");
        double valor = sc.nextDouble();

        double cincoPorCento = valor * 0.05;
        double reajuste = valor + cincoPorCento;

        System.out.printf("%.2f com reajuste de 5%% (%.2f) = %.2f", valor, cincoPorCento, reajuste);
    }
}
