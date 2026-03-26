package exercicios.generics.questao04.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class Aplicacao {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Bersek", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Attack on Titan", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        List<Manga> mangasSort = comparadorGenerico(mangas, new MangaByIdComparator());
        for (Manga manga : mangasSort) {
            System.out.println(manga);
        }
    }

    public static <T> List<T> comparadorGenerico(List<T> lista, Comparator<? super T> comparator) {
        lista.sort(comparator);
        return lista;
    }
}
