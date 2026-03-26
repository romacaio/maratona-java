package exercicios.generics.questao05.test;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<String> listNomes = new ArrayList<>(List.of("João", "Sérgio", "Luana"));
        List<String> listNomesVazia = new ArrayList<>();

        copiarListas(listNomes, listNomesVazia);
        System.out.println(listNomesVazia);

        List<Integer> listIntegers = new ArrayList<>(List.of(1, 12, 4));
        List<Number> listNumbersVazia = new ArrayList<>();

        copiarListas(listIntegers, listNumbersVazia);
        System.out.println(listNumbersVazia);
    }

    private static <T> void copiarListas(List<? extends T> origem, List<? super T> destino) {
        for (T item : origem) {
            destino.add(item);
        }
    }

}
