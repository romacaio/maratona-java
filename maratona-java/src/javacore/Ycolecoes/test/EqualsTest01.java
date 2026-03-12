package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "Caio César";
        String nome2 = new String("Caio César"); // Objeto criado no Heap e não na pool String
        System.out.println(nome1.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        System.out.println(s1.equals(s2));

        /*  utiliza o equals herdado do Objcect que faz apenas uma comparação de referência com "=="
        Por isso, sobrescrevemos o método equals dentro da classe SmartPhone com comportamento personalizado.

        */

    }
}
