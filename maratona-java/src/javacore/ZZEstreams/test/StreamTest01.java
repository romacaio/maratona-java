package javacore.ZZEstreams.test;

// 1. ordenar por título
// 2. trazer os 3 primeiros títulos dos ligth novels com preços menores que 4

import javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overlod", 3.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No game no life", 2.99),
            new LigthNovel("FullMetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Monogatari", 4.00)
    ));

    // sem streams...
    public static void main(String[] args) {
        ligthNovels.sort(Comparator.comparing(LigthNovel::getTitle));
        System.out.println(ligthNovels);

        List<String> titles = new ArrayList<>();
        for (LigthNovel ligthNovel : ligthNovels) {
            if (ligthNovel.getPrice() <= 4) {
                titles.add(ligthNovel.getTitle());
            }

            if (titles.size() == 3) break;
        }

        System.out.println(titles);
    }
}
