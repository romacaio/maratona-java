package exercicios.streams.questao03.test;

import exercicios.streams.questao03.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>(List.of(
                new Cliente("Alice", "alice@example.com"),
                new Cliente("Bruno", "bruno99@mail.com"),
                new Cliente("Carlos", "carlos_silva@mail.com")
        ));

        // lista de contendo apenas os endereços deemail dos clientes
        List<String> listEmails = clientes.stream()
                .map(Cliente::getEmail)
                .toList();

        System.out.println(listEmails);
    }
}

