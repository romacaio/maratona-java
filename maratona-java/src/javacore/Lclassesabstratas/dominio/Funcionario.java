package javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Desenvolvedor - Nome: " + this.nome + ", " + "Salário " + this.salario;
    }
}
