package exercicios.streams.questao04.test;

import java.util.Arrays;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<Double> precos = Arrays.asList(50.0, 100.0, 35.5, 70.0);
        System.out.println(precos);

        // lista com aumento de 10 %
        List<Double> precosComAumento = precos.stream()
                .map(m -> m + (m * 0.10))
                .toList();

        System.out.println(precosComAumento);
        System.out.println();

        // covertendo String para Integer
        List<String> numerosStr = Arrays.asList("10", "20", "30", "40");

        List<Integer> numeros = numerosStr.stream()
                .map(Integer::valueOf)
                .toList();

        System.out.println(numeros);
    }
}
