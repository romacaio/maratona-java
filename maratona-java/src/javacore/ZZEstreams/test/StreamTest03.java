package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overlod", 3.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No game no life", 2.99),
            new LigthNovel("FullMetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LigthNovel> stream = ligthNovels.stream();
        ligthNovels.forEach(System.out::println);

        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);

        // streams podem ser reutilizadas até realizar uma operação final, como o count. Depois disso não.
        // por isso aqui precisei novamente fazer: ligthNovels.stream()

        long count2 = ligthNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count2);

        // distinct() remove os repetidos, precisa do equals e hashCode implementados...
    }
}
