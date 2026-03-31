package javacore.ZZBcomportamentos.test;

import javacore.ZZBcomportamentos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Carro> carros = List.of(
            new Carro("verde", 2011),
            new Carro("preto", 1998),
            new Carro("red", 2019));

    public static void main(String[] args) {
        List<Carro> carrosVerdes = filtro(carros, new Predicate<Carro>() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        });

        System.out.println(carrosVerdes);

        // usando lambda
        List<Carro> carrosPreto = filtro(carros, carro -> carro.getCor().equals("preto"));
        System.out.println(carrosPreto);

        List<Carro> carrosAnoAntes = filtro(carros, carro -> carro.getAno() < 2015);
        System.out.println(carrosAnoAntes);

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filtro(numeros, num -> num % 2 == 0));
    }

    private static <T> List<T> filtro(List<T> list, Predicate<T> predicate) {
        List<T> listFiltrada = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) listFiltrada.add(t);
        }
        return listFiltrada;
    }

}
