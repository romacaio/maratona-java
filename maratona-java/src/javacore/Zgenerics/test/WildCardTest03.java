package javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest03 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animais = new ArrayList<>();
        printConsultaAnimal(animais);
    }

    /*
     wildcard -> ? extends Animal
     Precisa passar no teste "é um?"
     */


    // recebe Animal e qualquer uma que seja filha
    private static void printConsulta(List<? extends Animal> animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }

        //animais.add(new Cachorro()); não permite mais adição.
    }

    // recebe Animal e qualquer uma que seja super classe.
    private static void printConsultaAnimal(List<? super Animal> animais) {

        // permite adição
        animais.add(new Cachorro());
        animais.add(new Gato());
    }
}

