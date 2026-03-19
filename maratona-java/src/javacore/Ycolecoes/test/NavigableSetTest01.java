package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;
import javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getMarca().compareTo(smartphone2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(smartphone + "\n");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(5L, "Bersek", 9.5, 5));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-".repeat(50));

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 3.2, 5);
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("-".repeat(50));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

        /* métodos do Navigable:

        descendingSet() -> começa de baixo pra cima da árvore (ordem inversa).
        
        lower <
        floor <=
        higher >
        ceiling >=

        pollFirst -> remove e retorna o menor elemento (no caso o primeiro)
        poolLast -> remove e retorna o maio elemento (no caso o último)
         */

    }
}

