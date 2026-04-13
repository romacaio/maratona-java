package exercicios.streams.questao12.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacao {
    public static void main(String[] args) {
        List<String> transportes = List.of("Bike", "Carro", "Navio", "Avião", "Trem");

        transportes.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((K, V) -> System.out.println(K + ": " + V));

        Stream.of("Carlos", "Ana", "Bruno", "Eduarda")
                .sorted()
                .forEach(System.out::println);
    }
}
