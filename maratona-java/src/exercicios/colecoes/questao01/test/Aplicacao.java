package exercicios.colecoes.questao01.test;

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {
        int total = 30000;

        System.out.println("ArrayList");
        calcularTempo(new ArrayList<>(), total);
        System.out.println("-".repeat(30));

        System.out.println("LinkedList");
        calcularTempo(new LinkedList<>(), total);
        System.out.println("-".repeat(30));

        System.out.println("HashSet");
        calcularTempo(new HashSet<>(), total);
        System.out.println("-".repeat(30));

    }

    public static void calcularTempo(Collection<Integer> list, int totalElementos) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            list.add(i);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo inserção: " + (fim - inicio));

        long inicio2 = System.currentTimeMillis();
        for (int i = 0; i < totalElementos; i++) {
            list.contains(i);
        }

        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo Pesquisa: " + (fim2 - inicio2));
    }
}
