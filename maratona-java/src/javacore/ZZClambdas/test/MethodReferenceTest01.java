package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.Anime;
import javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 100)));

        // não pode utilizar o method reference, pois faz chamada pra dois métodos
//        animeList.sort((a1, a2) -> (a1.getTitulo().compareTo(a2.getTitulo())));

        animeList.sort(AnimeComparators::compararPorTitulo);
        System.out.println(animeList);

        animeList.sort(AnimeComparators::compararPorEpisodios);
        System.out.println(animeList);
    }
}
