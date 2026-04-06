package javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Aha Uhu o DevDojo é foda");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("-".repeat(20));

        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
