package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.Anime;
import javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// referência a um método de instância de um objeto específico
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 100)));

        AnimeComparators animeComparators = new AnimeComparators();
        animeList.sort(animeComparators::compararPorEpisodiosNoStatic);
        System.out.println(animeList);

        // usando lambda
        animeList.sort((a1, a2) -> animeComparators.compararPorEpisodiosNoStatic(a1, a2));
        System.out.println(animeList);
    }
}
