package exercicios.streams.questao09.test;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosPares);
        System.out.println();


        List<String> linguagens = List.of("java", "Python", "C", "JavaScript");

        String collect = linguagens.stream()
                .collect(Collectors.joining(", "));

        System.out.println(collect);
        System.out.println();

        List<Double> vendasMensal = List.of(2400.00, 3200.00, 3100.00, 3404.00);

        DoubleSummaryStatistics collect1 = vendasMensal.stream()
                .collect(Collectors.summarizingDouble(Double::doubleValue));

        System.out.println("Número de Vendas: " + collect1.getCount());
        System.out.println("Lucro Total: " + collect1.getSum());
        System.out.println("Valor Min: " + collect1.getMin());
        System.out.println("Valor Max: " + collect1.getMax());
        System.out.println("Valor Médio " + collect1.getAverage());

    }
}
