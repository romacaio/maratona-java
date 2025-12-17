package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Comprador;
import javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);

        carro1.COMPRADOR.setNome("Kuririn");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
