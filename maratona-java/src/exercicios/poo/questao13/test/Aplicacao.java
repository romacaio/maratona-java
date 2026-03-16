package exercicios.poo.questao13.test;

import exercicios.poo.questao13.model.Contrato;
import exercicios.poo.questao13.model.Parcela;
import exercicios.poo.questao13.service.ContratoService;
import exercicios.poo.questao13.service.PaypalService;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os Dados:");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        String dataInput = sc.nextLine();
        LocalDate data = LocalDate.parse(dataInput, ContratoService.dft);

        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

        Contrato contrato = new Contrato(numero, valorContrato, data);
        ContratoService contratoService = new ContratoService(new PaypalService());
        contratoService.processarContrato(contrato, numeroParcelas);

        System.out.println("Parcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela);
        }

    }
}
