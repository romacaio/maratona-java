package javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("vc", "você2"); // não é ignorado como no set, mas sobrescrito.
        map.putIfAbsent("teklado", "teclado"); // só adiciona caso não existir.

        System.out.println(map);
        System.out.println();

        // navegar através das chaves
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // navegar através dos valores
        System.out.println();
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println();

        // acessor a chave e valor no mesmo for.
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
