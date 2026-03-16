package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Bersek");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        // classe utilitária para trabalhar com coleções.
        // ordenando em ordem alfabética
        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println();

        List<Double> valores = new ArrayList<>();
        valores.add(100.21);
        valores.add(23.98);
        valores.add(21.21);
        valores.add(98.10);

        System.out.println(valores);
        // ordenando em ordem crescente
        Collections.sort(valores);
        System.out.println(valores);
    }
}
