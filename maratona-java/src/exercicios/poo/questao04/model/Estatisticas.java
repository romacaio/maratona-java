package exercicios.poo.questao04.model;

public class Estatisticas {
    public static final double PI = 3.14159;

    public static int somaArray(int[] array) {
        int soma = 0;
        for (double num : array) {
            soma += num;
        }
        return soma;
    }

    public static double mediaArray(int[] array) {
        int tamanho = array.length;
        double soma = somaArray(array);
        return soma / tamanho;
    }

    public static int maiorArray(int[] array) {
        int numMaior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= numMaior) {
                numMaior = array[i];
            }
        }

        return numMaior;
    }

    public static int menorArray(int[] array) {
        int numMenor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= numMenor) {
                numMenor = array[i];
            }
        }
        return numMenor;
    }

    public static void exibirEstatisticas(int[] array) {
        System.out.print("Array: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma Aarray: " + somaArray(array));
        System.out.printf("Média Aarray: %.2f", mediaArray(array));
        System.out.println("\nMaior elemento: " + maiorArray(array));
        System.out.println("Menor elemento: " + menorArray(array));
    }
}
