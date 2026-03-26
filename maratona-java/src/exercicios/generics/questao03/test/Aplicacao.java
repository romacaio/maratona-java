package exercicios.generics.questao03.test;

import exercicios.generics.questao03.model.ObjetoArmazenado;

public class Aplicacao {
    public static void main(String[] args) {
        ObjetoArmazenado<String> objetoArmazenado = new ObjetoArmazenado<>("Hello Word!");
        ObjetoArmazenado<Integer> objetoArmazenado1 = new ObjetoArmazenado<>(12);
        System.out.println(objetoArmazenado.getT());
        System.out.println(objetoArmazenado1.getT());
    }
}
