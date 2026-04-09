package javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // somando os elementos da lista
        integers.stream()
                .reduce((x, y) -> x + y) // return Optional, pois a lista pode está vazia
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, (x, y) -> x + y)); // return Integer, inicia com um valor inicial

        // usando method reference
        integers.stream()
                .reduce(Integer::sum)  // return Optional
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(0, Integer::sum)); // return Integer

        System.out.println("-".repeat(30));

        // multiplicando...
        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(1, (x, y) -> x * y));

        // inicial tem que ser 1, pois multiplicação por 0 sempre é == 0

        System.out.println("-".repeat(30));

        // maior número da lista
        integers.stream()
                .reduce((x, y) -> x > y ? x : y)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::max) // basicamente faz o que a gente fez no exemplo acima
                .ifPresent(System.out::println);
    }
}
