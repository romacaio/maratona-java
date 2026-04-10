package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LigthNovel;
import javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LigthNovel>> collect = ligthNovel.stream()
                .collect(Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));

        System.out.println(collect);

        // Map<Category,Map<Promotion,List<LigthNovel>>>

        Map<Category, Map<Promotion, List<LigthNovel>>> collect1 = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(collect1);
    }
}

