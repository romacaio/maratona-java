package javacore.Ycolecoes.test;


import javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class QueueTest02 {
    public static void main(String[] args) {

        // necessário a classe implementar o Comparable ou utilizar o Comparator
        Queue<Manga> queueManga = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        queueManga.add(new Manga(1L, "Hellsing Ultimate", 19.9, 0));
        queueManga.add(new Manga(5L, "Bersek", 9.5, 5));
        queueManga.add(new Manga(3L, "Pokemon", 3.2, 0));
        queueManga.add(new Manga(4L, "Attack on Titan", 11.20, 2));
        queueManga.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        queueManga.add(new Manga(10L, "Aaragon", 2.99, 0));

        while (!queueManga.isEmpty()) {
            System.out.println(queueManga.poll());
        }
    }
}
