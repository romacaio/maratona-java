package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        /*
        Forma antiga, since: 1.4 -> recebe como Parâmetro um Object, ou seja pode conter
        várias tipos de objetos...
         */

        List lista = new ArrayList();
        lista.add("William");
        lista.add("DevDojo Academy");
        lista.add(123);

        for (Object nome : lista) {
            System.out.println(nome);
        }
        System.out.println("-".repeat(20));

        /*
        Forma atual, since: 1.5 -> Utiliza genérics para definir o tipo objeto e força em tempo de compilação
         */

        List<String> nomes1 = new ArrayList<>();
        nomes1.add("Caio");
        nomes1.add("luiz");
        System.out.println(nomes1.remove(1));

        for (String nome : nomes1) {
            System.out.println(nome);
        }
        System.out.println();

        nomes1.add("Jeff");
        for (int i = 0; i < nomes1.size(); i++) {
            System.out.println(nomes1.get(i));
        }

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ana");
        nomes2.add("Julia");

        nomes1.addAll(nomes2);
        System.out.println(nomes1);

        /*
        Coleções não permitem tipos primitivos, pois internamente utilizam equals e hashCode e por não
        serem objetos não possuem.

        Utilizamos os Wrappers para representar os tipos primitivos.
         */

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
