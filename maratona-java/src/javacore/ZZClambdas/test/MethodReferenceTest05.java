package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.Anime;
import javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// referência a um contrutor
public class MethodReferenceTest05 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 100)));

        // usando lambda para um construtor sem argumentos
        Supplier<AnimeComparators> newAnimeComparators1 = () -> new AnimeComparators();
        AnimeComparators animeComparators1 = newAnimeComparators1.get();

        // usando method reference
        Supplier<AnimeComparators> newAnimeComparators2 = AnimeComparators::new; // podemos referenciar construtor
        AnimeComparators animeComparators2 = newAnimeComparators2.get();

        animeList.sort(animeComparators2::compararPorEpisodiosNoStatic);
        System.out.println(animeList);

        // usando lambda para construtor com argumentos
        BiFunction<String, Integer, Anime> animeBiFunction1 = (titulo, episodios) -> new Anime(titulo, episodios);
        Anime anime1 = animeBiFunction1.apply("Super Campeões", 36);

        // usando method reference
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        Anime anime2 = animeBiFunction2.apply("Super Onze", 65);

        System.out.println(anime1);
        System.out.println(anime2);

    }
}
