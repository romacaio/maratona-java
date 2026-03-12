package javacore.Ycolecoes;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        /*
        Forma antiga, since: 1.4 -> recebe como Parâmetro um Object, ou seja pode conter
        várias tipos de objetos...
         */

        List nomes = new ArrayList();
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes.add(123);

        for (Object nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-".repeat(20));

        /*
        Forma atual, since: 1.5 -> Utiliza genérics para definir o tipo objeto e força em tempo de compilação
         */

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Caio");
        nomes2.add("luiz");

        for (String nome : nomes2) {
            System.out.println(nome);
        }
        System.out.println();

        nomes2.add("Jeff");
        for (int i = 0; i < nomes2.size(); i++) {
            System.out.println(nomes2.get(i));
        }

    }
}
