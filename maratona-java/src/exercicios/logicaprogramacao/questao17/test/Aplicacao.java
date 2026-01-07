package exercicios.logicaprogramacao.questao17.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double conversaoGrauCelsius = (5 * (fahrenheit - 32) / 9);

        System.out.println("Em Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Em Grau Celsius: " + conversaoGrauCelsius + "°C");
    }
}
