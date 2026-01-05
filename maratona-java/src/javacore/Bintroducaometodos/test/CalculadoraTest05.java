package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();
        int[] array = {1, 2, 3, 4, 5};
        calculadora.somaArray(array);

        calculadora.SomaVarArgs(1, 2, 3, 4, 5);
    }
}
