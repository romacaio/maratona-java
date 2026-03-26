package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> listBarco = criarUmArrayComUmObjeto(new Barco("Canoa"));
    }

    private static <T> List<T> criarUmArrayComUmObjeto(T t) {
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> criarUmArrayComUmObjeto(T t) {
//        return List.of(t);
//    }


    // é totalmente possível usar mais de um.
    class tresAtributos<T, X, Z> {
        private T t;
        private X x;
        private Z z;
    }
}
