package exercicios.logicaprogramacao.questao09.test;

import exercicios.logicaprogramacao.questao09.model.AvaliacaoIMC;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Entre com sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        for (AvaliacaoIMC tipo : AvaliacaoIMC.values()) {
            if (tipo.avaliar(imc)) {
                System.out.printf("Avalicação do IMC (%.2f): %s", imc, tipo.getNomeRelatorio());
                break;
            }
        }
        sc.close();
    }
}
