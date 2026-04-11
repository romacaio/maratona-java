package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LigthNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LigthNovel> ligthNovel = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LigthNovel("Overlod", 10.99, Category.FANTASY),
            new LigthNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LigthNovel("No game no life", 2.99, Category.FANTASY),
            new LigthNovel("FullMetal Alchemist", 5.99, Category.FANTASY),
            new LigthNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LigthNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LigthNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        // agrupando por categoria e exibindo a quantidade de elementos de cada chave
        // groupingBy aceita um collector
        Map<Category, Long> collect = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        // agrupando por categoria e exibindo o LigthNovel de maior preço de cada chave
        // retorna encapsulado por um Optional
        Map<Category, Optional<LigthNovel>> collect1 = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))));

        System.out.println(collect1);

        // sem o Optional, utilizando o collectingAndThen
        Map<Category, LigthNovel> collect2 = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)), Optional::get)));

        System.out.println(collect2);
    }
}

