package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {

    public static void main(String[] args) {
        BarcoRentavelService service = new BarcoRentavelService();

        Barco barco = service.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");

        service.retornarBarcoAlugado(barco);
    }
}
