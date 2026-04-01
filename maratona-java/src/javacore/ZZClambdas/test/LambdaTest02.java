package javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> integers = map(strings, (String s) -> (s.length()));
        System.out.println(integers);

        // tipo e o retorno pode ser o mesmo
        List<String> stringsToUpperCase = map(strings, s -> s.toUpperCase());
        System.out.println(stringsToUpperCase);

        /* simplificando ainda mais com method reference
           regra: se a lambda chamar somente um método podemos usar o method reference

         */
        List<Integer> integers2 = map(strings, String::length);
        System.out.println(integers2);
    }

    private static <T, R> List<R> map(List<T> lista, Function<T, R> function) {
        List<R> resultado = new ArrayList<>();
        for (T e : lista) {
            R r = function.apply(e);
            resultado.add(r);
        }
        return resultado;
    }
}
