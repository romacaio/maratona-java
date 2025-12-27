package exercicios.poo.questao07.test;

import exercicios.poo.questao07.model.Cliente;
import exercicios.poo.questao07.service.ClienteService;
import exercicios.poo.questao07.view.ConsoleView;

public class Aplicacao {
    public static void main(String[] args) {

        Cliente[] clientes = ConsoleView.cadastroClientes();
        ClienteService.CalculaImc(clientes);
        ConsoleView.exibirClientes(clientes);

    }
}
