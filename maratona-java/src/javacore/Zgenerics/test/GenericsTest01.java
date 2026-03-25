package javacore.Zgenerics.test;

import javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        /*
        forma antiga antes do generics (java 1.4)
        aceita qualquer objeto.
         */

        List list = new ArrayList();
        list.add("Midoriya");
        list.add(123L);
        list.add(new Consumidor("Goku"));

        // difícil manipulação

        for (Object o : list) {
            if (o instanceof String) {
                System.out.println(((String) o).toUpperCase());
            } else if (o instanceof Long) {
                System.out.println(o);
            } else if (o instanceof Consumidor) {
                Consumidor consumidor = (Consumidor) o;
                System.out.println(consumidor.getNome());
            }
        }

        /*
        Com generics eu forço em tempo de execução permitindo apenas objetos desse tipo, no caso String.
        Porém quando é passado o byte code na verdade é utilizado List list = new ArrayList();

        Mas isso não importa, pois o generics garante que apenas objetos daquele tipo foi passado.
         */

        List<String> list1 = new ArrayList<>();
        list1.add("Goku");
        list1.add("Midoriya");

        for (String s : list1) {
            System.out.println(s);
        }

        add(list1, new Consumidor("Gohan"));
    }

    /*
    dessa forma ele vai aceitar o Consumidor, mesmo usando List<String> na instanciação da lista,
    na hora de iterar acaba gerando exception.

    O corretor é tbm utilizar o generics no méotodo: "add(List<String> lista, Consumidor consumidor)"
     */

    public static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
