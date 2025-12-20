package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class produtoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);

        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.CalcularImposto(computador);
    }
}
