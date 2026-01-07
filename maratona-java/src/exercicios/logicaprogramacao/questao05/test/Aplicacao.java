package exercicios.logicaprogramacao.questao05.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do salário mínimo: ");
        double salarioMinino = sc.nextDouble();

        System.out.println("Entre com o valor do seu salário: : ");
        double salarioUsuario = sc.nextDouble();

        int equivalente = (int) (salarioUsuario / salarioMinino);

        System.out.println("Seu salário equivale a " + equivalente + " salários mínimos");

        sc.close();
    }
}
