package javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }

    // peek() -> retorna o primeiro da fila
    // pool() -> retorna e romove o primeiro da fila, caso a fila esteja vazia retorna null
    // remove() -> retorna e romove o primeiro da fila, caso a fila esteja vazia lança uma exception
}
