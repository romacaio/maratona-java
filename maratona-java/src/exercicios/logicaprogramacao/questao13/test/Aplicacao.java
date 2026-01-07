package exercicios.logicaprogramacao.questao13.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Entre com sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " você é maior de idade.");

        } else {
            System.out.println(nome + " você é menor de idade.");
        }

        sc.close();
    }
}
