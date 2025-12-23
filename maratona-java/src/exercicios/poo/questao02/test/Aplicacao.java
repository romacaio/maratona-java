package exercicios.poo.questao02.test;

import exercicios.poo.questao02.model.*;

public class Aplicacao {
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new Cavalo(), new Cachorro(), new Cavalo(), new Gato()};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
