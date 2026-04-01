package javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));

        // igual ao Predicate, porém trabalha com 2 tipos
        BiPredicate<List<String>, String> verificarNome = List::contains;
        System.out.println(verificarNome.test(nomes, "Veldora"));
    }
}
