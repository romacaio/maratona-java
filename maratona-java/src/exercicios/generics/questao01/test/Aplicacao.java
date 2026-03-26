package exercicios.generics.questao01.test;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>(List.of(3, 5, 9, -3));
        List<String> nomes = new ArrayList<>(List.of("Ana", "João", "William", "Jéssica"));

        System.out.println(retornaPrimeiroElemento(inteiros));
        System.out.println(retornaPrimeiroElemento(nomes));
    }

    private static <T> T retornaPrimeiroElemento(List<T> lista) {
        return lista.get(0);
    }
}
