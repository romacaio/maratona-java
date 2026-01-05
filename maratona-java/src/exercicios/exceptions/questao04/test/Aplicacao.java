package exercicios.exceptions.questao04.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numString = sc.nextLine();

        try {
            Integer numInt = Integer.parseInt(numString);
            System.out.println("Isso é um inteiro.");

        } catch (NumberFormatException e) {
            System.out.println("Isso não é um inteiro!");

        } finally {
            sc.close();
        }
    }
}
