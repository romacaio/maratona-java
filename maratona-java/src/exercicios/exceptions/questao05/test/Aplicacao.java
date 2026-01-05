package exercicios.exceptions.questao05.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            System.out.println("valor do índice: " + array[num]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido");

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
