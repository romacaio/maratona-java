package exercicios.generics.questao02.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// não implementa comparable
class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

public class Aplicacao {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>(List.of(1, 5, 10, 40));
        ordenacaoGenerica(inteiros);
        System.out.println(inteiros);

        List<Pessoa> pessoas = new ArrayList<>(List.of(new Pessoa("Carlos"), new Pessoa("Paulo")));
        //ordenacaoGenerica(pessoas); não permite, pois não implementa Comparable
    }

    private static <T extends Comparable<? super T>> List<T> ordenacaoGenerica(List<T> lista) {
        Collections.sort(lista);
        return lista;
    }
}
