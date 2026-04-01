package javacore.ZZClambdas.service;

import javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int compararPorTitulo(Anime a1, Anime a2) {
        return a1.getTitulo().compareTo(a2.getTitulo());
    }

    public static int compararPorEpisodios(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
}
