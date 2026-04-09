package exercicios.streams.questao07.test;

import java.util.List;
import java.util.Optional;

public class Aplicacao {
    public static void main(String[] args) {
        List<Optional<String>> talvezNomes = List.of(
                Optional.of("Ana"),
                Optional.empty(),
                Optional.of("Bia"),
                Optional.empty(),
                Optional.of("Caio")
        );

        List<String> list = talvezNomes.stream()
                .flatMap(Optional::stream)
                .toList();

        System.out.println(list);
    }
}
