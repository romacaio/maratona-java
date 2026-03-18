package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        /*
        hashSet utiliza o hashCode para posicionar os elementos na coleção.
        Não mantem a ordem de inserção, pois não possui índice e sim o hashCode.

        Caso queira manter a ordem de inserção utilizamos o LinkedHasSet<>()
         */

        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(5L, "Bersek", 19.9, 5));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 3.2, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
