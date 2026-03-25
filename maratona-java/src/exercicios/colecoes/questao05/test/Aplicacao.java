package exercicios.colecoes.questao05.test;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {
        int numLancamentos = 100;

        Random random = new Random();
        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < numLancamentos; i++) {
            int numero = random.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado)) {
                lancamentos.put(resultado, lancamentos.get(resultado) + 1);
            } else {
                lancamentos.put(resultado, 1);
            }
        }

        System.out.print("Jogando");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(2000);
                System.out.print(".");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }
}
