package javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        //printConsulta(cachorros);
        //printConsulta(gatos);

        /*
        por causa do type Erasure, o java não permite o printConsulta(cachorros) e gera um erro de compilação.
        Pois, após o código compilado a lista perde a referência do generics passada e não consegue fazer a relação
        do polimorfismo corretamente.
         */

    }

    private static void printConsulta(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }
        animais.add(new Cachorro());
    }
}
