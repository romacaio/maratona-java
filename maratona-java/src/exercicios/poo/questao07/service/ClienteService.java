package exercicios.poo.questao07.service;

import exercicios.poo.questao07.model.ClassificacaoImc;
import exercicios.poo.questao07.model.Cliente;

public class ClienteService {

    public static void CalculaImc(Cliente[] clientes) {
        for (Cliente cliente : clientes) {
            double imc = cliente.getPeso() / (cliente.getAltura() * cliente.getAltura());
            cliente.setImc(imc);
        }
    }

    public static ClassificacaoImc ClassificaImc(Cliente cliente) {
        double imc = cliente.getImc();
        for (ClassificacaoImc c : ClassificacaoImc.values()) {
            if (c.pertence(imc)) {
                return c;
            }
        }
        return null;

    }
}
