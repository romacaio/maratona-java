package javacore.ZZBcomportamentos.test;

import javacore.ZZBcomportamentos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
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
    }

    private static List<Carro> filtro(List<Carro> carros, Predicate<Carro> carroPredicate) {
        List<Carro> carrosFiltrados = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro)) carrosFiltrados.add(carro);
        }
        return carrosFiltrados;
    }
}
