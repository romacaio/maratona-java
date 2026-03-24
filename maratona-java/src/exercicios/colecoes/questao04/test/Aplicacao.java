package exercicios.colecoes.questao04.test;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>();
        populacaoEstadosNE.put("PE", 9616621);
        populacaoEstadosNE.put("AL", 3351543);
        populacaoEstadosNE.put("CE", 9187103);
        populacaoEstadosNE.put("RB", 3534265);

        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println("RN: " + populacaoEstadosNE.get("RN"));

        System.out.println("\nConfira se o Estado da (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039 .277:");

        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(populacaoEstadosNE);

        System.out.println("\nExiba a população do estado PE:");
        System.out.println("PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> linkedHashMapMap = new LinkedHashMap<>();
        linkedHashMapMap.put("PE", 9616621);
        linkedHashMapMap.put("AL", 3351543);
        linkedHashMapMap.put("CE", 9187103);
        linkedHashMapMap.put("RB", 3534265);
        populacaoEstadosNE.put("RN", 3534165);
        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(linkedHashMapMap);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        SortedMap<String, Integer> treeMap = new TreeMap<>(populacaoEstadosNE);
        for (String estado : treeMap.keySet()) {
            System.out.println(estado + ": " + treeMap.get(estado));
        }

        System.out.println("\nExiba o estado com o menor população e seu respectivo valor");

        Collection<Integer> populacao = treeMap.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }

        System.out.printf("Menor população: %s - %d\n", estadoMenorPopulacao, treeMap.get(estadoMenorPopulacao));

        System.out.println("\nExiba o estado com o maior população e seu respectivo valor");
        System.out.printf("Menor população: %s - %d\n", estadoMaiorPopulacao, treeMap.get(estadoMaiorPopulacao));

        System.out.println("\nExiba a soma da população desses estados: ");
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        int soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: ");
        System.out.println("Média: " + soma / linkedHashMapMap.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println("isEmpty: " + populacaoEstadosNE.isEmpty());

    }
}
