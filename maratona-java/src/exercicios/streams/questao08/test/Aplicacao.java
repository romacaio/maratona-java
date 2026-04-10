package exercicios.streams.questao08.test;

import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        List<Integer> integers = List.of(5, 10, 15, 20);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);


        List<String> nomes = List.of("Mariana", "João", "Alexandre", "Bianca");
        nomes.stream()
                .reduce((x, y) -> x.length() > y.length() ? x : y)
                .ifPresent(System.out::println);

        List<String> frases = List.of("Olá mundo", "Java Streams", "Reduce");
        frases.stream()
                .map(String::length)
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
    }
}
