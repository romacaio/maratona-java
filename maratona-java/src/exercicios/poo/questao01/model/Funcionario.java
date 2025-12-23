package exercicios.poo.questao01.model;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }

    public void exibirDados(Funcionario funcionario) {

    }

    public double ganhoAnual() {
        return this.salario * 12;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


