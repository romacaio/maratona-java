package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Consumidor;
import javacore.Ycolecoes.dominio.Manga;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(1L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(5L, "Bersek", 9.5);
        Manga manga3 = new Manga(3L, "Pokemon", 3.2);
        Manga manga4 = new Manga(4L, "Attack on Titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        List<Manga> listaMangaConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> listaMangaConsumidor2 = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, listaMangaConsumidor1);
        consumidorManga.put(consumidor2, listaMangaConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println("-".repeat(5) + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }

    }
}
