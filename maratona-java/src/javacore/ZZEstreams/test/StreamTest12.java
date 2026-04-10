package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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

    /*
    Imagine o cenário onde queremos agrupar os LigthNovel por categorias. Decidimos utilizar um Map (hashMap), o qual
    terá como chaves -> uma Category e valores -> uma lista de LigthNovel.
     */

    public static void main(String[] args) {
        // abordagem sem Stream (groupingBy)
        Map<Category, List<LigthNovel>> categoryLigthNovelMap = new HashMap<>();

        List<LigthNovel> fantasy = new ArrayList<>();
        List<LigthNovel> drama = new ArrayList<>();
        List<LigthNovel> romance = new ArrayList<>();

        for (LigthNovel ligthNovel : ligthNovel) {
            switch (ligthNovel.getCategory()) {
                case FANTASY -> fantasy.add(ligthNovel);
                case DRAMA -> drama.add(ligthNovel);
                case ROMANCE -> romance.add(ligthNovel);
            }
        }

        categoryLigthNovelMap.put(Category.FANTASY, fantasy);
        categoryLigthNovelMap.put(Category.DRAMA, drama);
        categoryLigthNovelMap.put(Category.ROMANCE, romance);

        for (Map.Entry<Category, List<LigthNovel>> entry : categoryLigthNovelMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        // utilizando groupingBy
        Map<Category, List<LigthNovel>> collect = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory));

        System.out.println(collect);

    }
}
