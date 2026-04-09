package javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        /*
            Até aqui, estava gerando as Streams a partir de uma coleção, mais existem outras
            formas que não nececitam delas.
         */

        // a partir das versões dos tipos primtivos
        IntStream.rangeClosed(0, 50).filter(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(0, 50).filter(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // através do método of() da própria interface
        Stream.of("Eleve", "o", "Cosmo", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        // a partir de um array
        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println();

        // a partir de um arquivo
        try (Stream<String> lines = Files.lines(Path.of("file.txt"))) {

            lines.filter(line -> line.contains("Java"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
