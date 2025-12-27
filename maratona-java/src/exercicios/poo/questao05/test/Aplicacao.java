package exercicios.poo.questao05.test;

import exercicios.poo.questao05.model.CamaroteInferior;
import exercicios.poo.questao05.model.CamaroteSuperior;
import exercicios.poo.questao05.model.Normal;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite:");
            System.out.println("[1] - Ingresso Nomal\n[2] - Ingresso VIP");
            int tipoIngresso = sc.nextInt();

            if (tipoIngresso == 1) {
                Normal ingresso = new Normal(200);
                ingresso.imprimeValor();
                return;
            } else if (tipoIngresso == 2) {
                break;

            } else {
                System.out.println("Digite uma opção válida");
                continue;
            }
        }
        while (true) {
            System.out.println("Digite: ");
            System.out.println("[1] - Camarote Inferior\n[2] - Camarote Superior");
            int tipoCamarote = sc.nextInt();

            if (tipoCamarote == 1) {
                CamaroteInferior ingresso = new CamaroteInferior(200, 120, "Inferior");
                ingresso.imprimeValor();
                System.out.println("\nLocalização: " + ingresso.getLocalizacao());
                return;
            } else if (tipoCamarote == 2) {
                CamaroteSuperior ingresso = new CamaroteSuperior(200, 120, "Superior", 80);
                ingresso.imprimeValor();
                System.out.println("\nLocalização: " + ingresso.getLocalizacao());
                return;
            } else {
                System.out.println("Digite uma opção válida");
                continue;
            }
        }
    }
}
