package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LigthNovel;
import javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static javacore.ZZEstreams.dominio.Promotion.*;

public class StreamTest15 {
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

        Map<Category, DoubleSummaryStatistics> collect = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.summarizingDouble(LigthNovel::getPrice)));

        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));

        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect2);

    }

    public static Promotion getPromotion(LigthNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}

