package javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente - Nome: " + this.nome + ", " + "Salário " + this.salario;
    }
}
