package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private Double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + " recebi o de $" + this.salario);
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
