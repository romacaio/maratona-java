package javacore.Bintroduçaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public double mediaSalario() {
        if (salarios == null) {
            return 0;
        }
        double media = 0;
        for (double salario : this.salarios) {
            media += salario;
        }
        return media / salarios.length;
    }

    public void imprime() {
        System.out.println("Dados Funcionário");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salarios[i]);
        }
        System.out.println("Média salários: R$ " + mediaSalario());
    }
}
