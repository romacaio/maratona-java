package exercicios.streams.questao02.test;

import java.util.stream.Stream;

public class Aplicacao {
    public static void main(String[] args) {
        // gera números infinitos
        Stream<Integer> numeros = Stream.iterate(1, n -> n + 1);

        // primeiro número maior que 100
        numeros.filter(n -> n % 7 == 0 && n > 100)
                .findFirst()
                .ifPresent(System.out::println);

        // para de gerar números até econtrar o primeiro que satisfaz a condição
    }
}
