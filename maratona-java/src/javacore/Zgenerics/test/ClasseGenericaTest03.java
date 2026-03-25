package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.RentalSerive;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {

    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"), new Carro("Fusca")));

        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalSerive<Carro> rentalSerive = new RentalSerive<>(carrosDisponiveis);

        Carro carro = rentalSerive.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");

        rentalSerive.retornarObjetoAlugado(carro);

        System.out.println("-".repeat(20));

        RentalSerive<Barco> rentalSerive2 = new RentalSerive<>(barcosDisponiveis);

        Barco barco = rentalSerive2.buscarObjetoDisponivel();
        System.out.println("Usando o Barco por um mês...");

        rentalSerive2.retornarObjetoAlugado(barco);

    }
}
