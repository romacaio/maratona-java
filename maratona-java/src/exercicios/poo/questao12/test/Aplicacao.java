package exercicios.poo.questao12.test;

import exercicios.poo.questao12.model.Contribuinte;
import exercicios.poo.questao12.model.PessoaFisica;
import exercicios.poo.questao12.model.PessoaJuridica;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Números de contribuintes: ");
        int num = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Contribuinte[] contribuintes = new Contribuinte[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Contribuinte #" + (i + 1) + " dados");
            System.out.print("Pessoa Física ou judicial (f/j): ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (tipo == 'f') {
                System.out.print("Gasto saúde: ");
                double gastoSaude = sc.nextDouble();
                contribuintes[i] = new PessoaFisica(nome, rendaAnual, gastoSaude);

            } else {
                System.out.print("Número funcionários: ");
                int numFuncionaos = sc.nextInt();
                contribuintes[i] = new PessoaJuridica(nome, rendaAnual, numFuncionaos);
            }
        }

        double totalImposto = 0;
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte);
            totalImposto += contribuinte.calcularImposto();
        }

        System.out.printf("Total imposto: $%.2f", totalImposto);
    }
}
