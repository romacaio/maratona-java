package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("2222", "Pixel");
        Smartphone s3 = new Smartphone("3333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("2222", "Pixel");
        System.out.println(smartphones.contains(s4)); // contains utiliza o equals internamente

        int indexOfS4 = smartphones.indexOf(s4);
        System.out.println(indexOfS4); // -1 caso não exista
        System.out.println(smartphones.get(indexOfS4));

    }
}
