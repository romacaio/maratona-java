package javacore.Bintroduçaometodos.test;

import javacore.Bintroduçaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividirDoisNumeros(4, 2);
        System.out.println(resultado);

    }
}
