package exercicios.streams.questao13.test;

import exercicios.streams.questao11.model.Funcionario;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Funcionario("Alice", "IT", 28, 3000.00, true),
                new Funcionario("Bob", "Sales", 45, 5000.00, false),
                new Funcionario("Carol", "IT", 35, 4500.00, true),
                new Funcionario("David", "HR", 52, 4500.00, true),
                new Funcionario("Eve", "Sales", 29, 3500.00, true)
        );

        System.out.println("## Funcionários ordenados por maior salário e ordem alfabética ##");
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n## Funcionários ativos de cada departamento ##");

        funcionarios.stream()
                .filter(Funcionario::isAtivo)
                .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                        Collectors.mapping(Funcionario::getNome, Collectors.toList())))
                .forEach((K, V) -> System.out.println(K + ": " + V));
    }
}
