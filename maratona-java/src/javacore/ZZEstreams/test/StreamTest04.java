package javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santod", "Sandy Carolina");
        List<String> developers = List.of("William", "Davis", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        // antes do java 8 para imprimir atriburos alinhados (coleções)
        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-".repeat(20));

        // usando flatMap -> método útil pra lidar com esses casos
        devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
