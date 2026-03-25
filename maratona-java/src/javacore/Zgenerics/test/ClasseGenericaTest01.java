package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    
    public static void main(String[] args) {
        CarroRentavelService service = new CarroRentavelService();

        Carro carro = service.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");

        service.retornarCarroAlugado(carro);
    }
}
