package exercicios.poo.questao06.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de clientes a ser atendido:  ");
        int numClientes = sc.nextInt();

        int contConsultaNormal = 0;
        int contConsultaEmergencial = 0;
        String chamada;

        for (int i = 0; i < numClientes; i++) {
            while (true) {
                System.out.println("Digite:");
                System.out.println("[1] - Consulta Normal\n[2] - Consulta Emergêncial");
                int op = sc.nextInt();
                if (op == 1) {
                    contConsultaNormal++;
                    break;
                } else if (op == 2) {
                    contConsultaEmergencial++;
                    break;
                } else {
                    System.out.println("Digite uma opção válida.");
                    continue;
                }
            }
        }
        System.out.println("## Chamada ##");
        int countChamadasNormais = 0;
        for (int i = 0; i < numClientes; i++) {
            if (countChamadasNormais == 4 && contConsultaEmergencial != 0) {
                chamada = "Consulta Emergêncial";
                System.out.println("Próximo: " + chamada);
                countChamadasNormais = 0;
                contConsultaEmergencial--;

            } else if (contConsultaNormal == 0 && contConsultaEmergencial != 0) {
                chamada = "Consulta Emergêncial";
                System.out.println("Próximo: " + chamada);
                contConsultaEmergencial--;
            } else {
                chamada = "Consulta Normal";
                System.out.println("Próximo: " + chamada);
                countChamadasNormais++;
                contConsultaNormal--;
            }
        }
    }
}
