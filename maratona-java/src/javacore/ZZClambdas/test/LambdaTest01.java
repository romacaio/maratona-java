package javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        forEach(strings, nome -> System.out.println(nome));

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        forEach(integers, num -> System.out.println(num));


    }

    private static <T> void forEach(List<T> lista, Consumer<T> consumer) {
        for (T e : lista) {
            consumer.accept(e);

            /*
            public abstract <T> void accept(T t) -> basicamente o predicate mas com retorno void.
            serve para executar uma ação: (imprimir, salvar, enviar)
             */

        }
    }
}
