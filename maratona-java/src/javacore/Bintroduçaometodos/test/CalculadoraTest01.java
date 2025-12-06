package javacore.Bintroduçaometodos.test;

import javacore.Bintroduçaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
