package exercicios.streams.questao05.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        List<List<String>> equipes = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Carlos", "Diana", "Eric"),
                Arrays.asList("Fabiana")
        );

        // transformando em uma única lista com todos os funcionários
        List<String> funcionarios = equipes.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(funcionarios);
    }
}
