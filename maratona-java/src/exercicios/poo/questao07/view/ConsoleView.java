package exercicios.poo.questao07.view;

import exercicios.poo.questao07.model.ClassificacaoImc;
import exercicios.poo.questao07.model.Cliente;
import exercicios.poo.questao07.service.ClienteService;

import java.util.Scanner;

public class ConsoleView {

    public static Cliente[] cadastroClientes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos clientes serão cadastrados? ");
        int numClientes = sc.nextInt();
        sc.nextLine();

        Cliente[] clientes = new Cliente[numClientes];

        for (int i = 0; i < clientes.length; i++) {

            System.out.println("## Cadastro Cliente ##");
            System.out.print("Nome: ");
            String nome = sc.nextLine();


            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.println();

            Cliente cliente = new Cliente(nome, altura, peso);
            clientes[i] = cliente;
        }
        sc.close();
        return clientes;
    }

    public static void exibirClientes(Cliente[] clientes) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);

            ClassificacaoImc classificacaoImc = ClienteService.ClassificaImc(cliente);
            System.out.println("Descrição: " + classificacaoImc.getDESCRICAO());
            System.out.println("-------------------------------------------");
        }
    }

}
