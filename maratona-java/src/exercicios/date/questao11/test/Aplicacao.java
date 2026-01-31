package exercicios.date.questao11.test;

import exercicios.date.questao11.Exception.NivelTrabalhadorParseException;
import exercicios.date.questao11.model.ContratoPorHora;
import exercicios.date.questao11.model.Departamento;
import exercicios.date.questao11.model.NivelTrabalhador;
import exercicios.date.questao11.model.Trabalhador;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(("MM/yyyy"));

        Trabalhador trabalhador;

        while (true) {
            try {
                System.out.print("Entre com o nome do departamento: ");
                String nomeDepertamento = sc.nextLine();
                Departamento departamento = new Departamento(nomeDepertamento);

                System.out.print("Entre com os dados do trabalhador\n");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Nivel: ");
                String nivelString = sc.nextLine();
                NivelTrabalhador nivel = NivelTrabalhador.parse(nivelString);

                System.out.print("Salário Base: R$ ");
                double salarioBase = sc.nextDouble();
                sc.nextLine();

                ArrayList<ContratoPorHora> contratos = new ArrayList<>();
                trabalhador = new Trabalhador(nome, nivel, departamento, salarioBase, contratos);

            } catch (InputMismatchException e) {
                System.out.println("Digite algo válido\n");
                sc.nextLine();
                continue;

            } catch (NivelTrabalhadorParseException e) {
                System.out.println("Digite um nível válido\n");
                continue;
            }

            break;
        }

        System.out.print("Quantos contratos esse trabalhador possui? ");
        int numContratos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numContratos; i++) {
            while (true) {
                try {
                    System.out.println("\nEntre contrato #" + (i + 1) + " dados:");

                    System.out.print("Data (DD/MM/YYYY): ");
                    String dataString = sc.nextLine();
                    LocalDate data = LocalDate.parse(dataString, dtf1);

                    System.out.print("Valor por hora: R$ ");
                    double valorPorHora = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Duração (horas): ");
                    int horas = sc.nextInt();
                    sc.nextLine();

                    ContratoPorHora contrato = new ContratoPorHora(data, valorPorHora, horas);
                    trabalhador.addContrato(contrato);

                } catch (InputMismatchException e) {
                    System.out.println("Digte algo válido\n");
                    sc.nextLine();
                    continue;

                } catch (DateTimeParseException e) {
                    System.out.println("Digite a data no padrão correspondente");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        }

        System.out.println();
        while (true) {
            try {
                System.out.print("Entre com o ano e o Mês para calcular a renda (MM/yyyy): ");
                String dataString = sc.nextLine();
                YearMonth data = YearMonth.parse(dataString, dtf2);

                double renda = trabalhador.renda(data.getYear(), data.getMonthValue());
                System.out.println("Nome: " + trabalhador.getNome());
                System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
                System.out.printf("Renda para %s: %.2f", data.format(dtf2), renda);

            } catch (DateTimeParseException e) {
                System.out.println("Digite a data no padrão correspondente\n");
                continue;
            }
            break;
        }
    }
}
