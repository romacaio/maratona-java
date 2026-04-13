package exercicios.streams.questao11.test;

import exercicios.streams.questao11.model.Funcionario;

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

        System.out.println("## Departamentos e números de funcionário ##");
        funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento, Collectors.counting()))
                .forEach((K, V) -> System.out.println(K + ": " + V));

        System.out.println("\n## Agrupamento por faixa etária dos Funcionários ##");

        funcionarios.stream()
                .collect(Collectors.groupingBy(f -> {
                    if (f.getIdade() < 30) return "MENOR_30";
                    else if (f.getIdade() <= 50) return "ENTRE_30_50";
                    else return "MAIOR_50";

                }))
                .forEach((K, V) -> System.out.println(K + ": " + V));

        System.out.println("\n## Agrupamento por nível dos Funcionários ##");

        funcionarios.stream()
                .collect(Collectors.groupingBy(f -> {
                    if (f.getIdade() <= 30) return "Jovens";
                    else if (f.getIdade() <= 38) return "Experientes";
                    else return "Seniors";
                }))
                .forEach((K, V) -> System.out.println(K + ": " + V));

        System.out.println("\n## Agrupamento por inatividade dos Funcionários ##");

        funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::isAtivo, Collectors.counting()))
                .forEach((K, V) -> System.out.println(K + ": " + V));

        System.out.println("\n## Total de salário pago ##");

        double sum = funcionarios.stream().
                mapToDouble(Funcionario::getSalario)
                .sum();

        // usando reduce
        funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .reduce((x, y) -> x + y)
                .ifPresent(d -> System.out.println("R$ " + sum));

        System.out.println("R$ " + sum);

        System.out.println("\n## Total de salário pago por derpatamento ##");

        funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento, Collectors.summingDouble(Funcionario::getSalario)))
                .forEach((K, V) -> System.out.println(K + ": " + V));
    }
}
