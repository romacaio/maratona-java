package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.LigthNovel;
        
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99),
            new LigthNovel("Overlod", 10.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No game no life", 2.99),
            new LigthNovel("FullMetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println("Existe algum ligthNovels com preço maior que 8: " + ligthNovels.stream()
                .anyMatch(ln -> ln.getPrice() > 8));

        System.out.println("Todos os ligthNovels possuem preço maior que 0: " + ligthNovels.stream()
                .allMatch(ln -> ln.getPrice() > 0));

        System.out.println("Nenhum dos ligthNovels possuem preço maior que 0: " + ligthNovels.stream()
                .noneMatch(ln -> ln.getPrice() > 0));

        System.out.println();

        ligthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        ligthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LigthNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }

    /*
    Matching:

    AnyMatch -> verifica se pelomenos UM elemento bate com o match
    AllMatch -> verifica se TODOS batem com o match
    noneMatch -> verifica se NENHUM bate com o match

    return Boolean em todos os caso...

    Finding:

    findAny -> retorna 1 elemento qualquer, não garante ordem
    findFirst -> retorna o primeiro elemento

    return Optional em todos os casos, pois podem não existir...

     */
}
