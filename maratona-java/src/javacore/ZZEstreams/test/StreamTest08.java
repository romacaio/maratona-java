package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        ligthNovels.stream()
                .map(LigthNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice) // return DoubleStream
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);

        /*
        IntStream, DoubleStream, LongStream -> são versões especializadas do Stream para trabalhar com
        tipos primitivos

        No primeiro exemplo, o preco LigthNovel é um double (primitivo) e o Stream acaba tendo que fazer
        cast (unboxing e boxing) inúmeras vezes. Em aplicações de alta performance é melhor lidar de uma maneira melhor utilizando
        essas versões.
         */
    }
}
