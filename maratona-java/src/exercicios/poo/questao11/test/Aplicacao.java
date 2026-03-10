package exercicios.poo.questao11.test;

import exercicios.poo.questao11.model.Funcionario;
import exercicios.poo.questao11.model.FuncionarioTerceirizado;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de funcionários que serão lidos: ");
        int num = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Funcionario[] funcionarios = new Funcionario[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Funcionário #%d dados", i + 1);
            System.out.print("Terceirado (s/n): ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("horas: ");
            int horas = sc.nextInt();

            System.out.print("valor por hora: ");
            double valorPorHoras = sc.nextDouble();

            if (tipo == 's') {
                System.out.print("Custo adicional: ");
                double valorAdicional = sc.nextDouble();
                funcionarios[i] = new FuncionarioTerceirizado(nome, horas, valorPorHoras, valorAdicional);

            } else {
                funcionarios[i] = new Funcionario(nome, horas, valorPorHoras);
            }

        }

        System.out.println("\nFuncionários: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
