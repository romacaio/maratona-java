package exercicios.streams.questao06.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<String> linguagens = new ArrayList<>(List.of("java,python,c", "ruby,javascript", "c+,go"));

        List<String> list = linguagens.stream()
                .map(l -> l.split(","))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(list);
    }
}
