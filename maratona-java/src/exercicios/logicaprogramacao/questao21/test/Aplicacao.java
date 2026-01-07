package exercicios.logicaprogramacao.questao21.test;

import java.util.Random;

public class Aplicacao {
    public static void main(String[] args) {

        Random random = new Random();
        int numero = random.nextInt(101); // 0 a 100

        System.out.println(numero);
    }
}
