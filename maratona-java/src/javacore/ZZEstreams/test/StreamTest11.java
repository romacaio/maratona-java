package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overlod", 10.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No game no life", 2.99),
            new LigthNovel("FullMetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Monogatari", 4.00)
    ));

    // métodos semlhantes utilizando collector e Collectors
    public static void main(String[] args) {

        // contar o número de elementos
        System.out.println(ligthNovels.stream().count());
        System.out.println(ligthNovels.stream().collect(Collectors.counting()));

        // retornar o maior / menor elemento
        ligthNovels.stream()
                .max(Comparator.comparing(LigthNovel::getPrice))
                .ifPresent(System.out::println);

        ligthNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)))
                .ifPresent(System.out::println);

        // retornar a soma dos elementos
        System.out.println(ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice)
                .sum());

        System.out.println(ligthNovels.stream()
                .collect(Collectors.summingDouble(LigthNovel::getPrice)));

        // retornar a média dos elementos
        ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice).average()
                .ifPresent(System.out::println);

        System.out.println(ligthNovels.stream()
                .collect(Collectors.averagingDouble(LigthNovel::getPrice)));

        System.out.println("-".repeat(30));

        /*
        todas essas operações que a gente fez: soma,max,min,averege... podem existir em um único objeto,
        através do método (summarizing)
         */

        DoubleSummaryStatistics collect = ligthNovels.stream()
                .collect(Collectors.summarizingDouble(LigthNovel::getPrice));
        System.out.println(collect);

        /*
        tbm podemos juntar os títulos de todos os LigthNovel em uma única String usando o método
        (joining) e tbm escolher um delimitador.
         */

        System.out.println(ligthNovels.stream()
                .map(LigthNovel::getTitle)
                .collect(Collectors.joining(", ")));
    }
}
