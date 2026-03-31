package javacore.ZZBcomportamentos.test;

import javacore.ZZBcomportamentos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Carro> carros = List.of(
            new Carro("verde", 2011),
            new Carro("preto", 1998),
            new Carro("red", 2019));

    public static void main(String[] args) {
        System.out.println(filtroCarrosVerdes(carros));
        System.out.println(filtroCarrosPorCor(carros, "red"));
        System.out.println(filtroCarrosPorCor(carros, "verde"));
        System.out.println(filtroCarrosPorCor(carros, "preto"));

        System.out.println("-".repeat(50));

        System.out.println(filtrarPorAnoAntes(carros, 2015));
    }

    private static List<Carro> filtroCarrosVerdes(List<Carro> carros) {
        List<Carro> carrosFiltrados = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("verde")) carrosFiltrados.add(carro);
        }
        return carrosFiltrados;
    }

    private static List<Carro> filtroCarrosPorCor(List<Carro> carros, String cor) {
        List<Carro> carrosFiltrados = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals(cor)) carrosFiltrados.add(carro);
        }
        return carrosFiltrados;
    }

    private static List<Carro> filtrarPorAnoAntes(List<Carro> carros, int ano) {
        List<Carro> carrosFiltrados = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() < ano) carrosFiltrados.add(carro);
        }
        return carrosFiltrados;
    }
}