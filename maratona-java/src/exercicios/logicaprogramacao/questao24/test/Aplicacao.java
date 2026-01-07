package exercicios.logicaprogramacao.questao24.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem (em horas): ");
        double tempo = sc.nextDouble();

        System.out.println("Informe a velocidade média (Km/h): ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros utilizados: %.2f L%n", litrosUsados);

        sc.close();
    }
}
