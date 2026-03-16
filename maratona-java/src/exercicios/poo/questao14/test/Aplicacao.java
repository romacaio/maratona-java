package exercicios.poo.questao14.test;

import exercicios.poo.questao14.model.LocacaoVeiculo;
import exercicios.poo.questao14.model.Veiculo;
import exercicios.poo.questao14.service.ImpostoBrasil;
import exercicios.poo.questao14.service.LocacaoService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados da locação");

        System.out.print("Modelo carro: ");
        String modeloCarro = sc.nextLine();
        Veiculo veiculo = new Veiculo(modeloCarro);

        System.out.print("Check-in (dd/MM/yyyy HH:mm): ");
        String inputCheckIn = sc.nextLine();
        LocalDateTime dateCheckIn = LocalDateTime.parse(inputCheckIn, LocacaoService.dtf);

        System.out.print("Check-out (dd/MM/yyyy HH:mm): ");
        String inputCheckOut = sc.nextLine();
        LocalDateTime dateCheckOut = LocalDateTime.parse(inputCheckOut, LocacaoService.dtf);

        LocacaoVeiculo locacaoVeiculo = new LocacaoVeiculo(veiculo, dateCheckIn, dateCheckOut);

        System.out.print("Valor por hora: ");
        double valorPorHora = sc.nextDouble();
        sc.nextLine();

        System.out.print("Valor por dia: ");
        double valorPorDia = sc.nextDouble();
        sc.nextLine();

        LocacaoService locacaoService = new LocacaoService(valorPorHora, valorPorDia, new ImpostoBrasil());
        locacaoService.processarLocacao(locacaoVeiculo);

        System.out.println(locacaoVeiculo.getFatura());

    }
}
