package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void CalcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do Produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
