package exercicios.streams.questao10.test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacao {
    public static void main(String[] args) {

        List<String> collect = Stream.of("Maça", "Banana", "Laranja", "Banana")
                .distinct()
                .sorted()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(collect);
    }
}
