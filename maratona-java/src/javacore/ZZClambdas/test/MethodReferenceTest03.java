package javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// referência a um método de instância de um tipo
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        // usando method reference
        Function<String, Integer> numStringToInteger = Integer::parseInt;

        // usando Lambda
        Function<String, Integer> numStringToInteger2 = s -> Integer.parseInt(s);

        // usando classe anônima
        Function<String, Integer> numStringToInteger3 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Integer num = numStringToInteger.apply("1952");
        System.out.println(num);
    }
}
