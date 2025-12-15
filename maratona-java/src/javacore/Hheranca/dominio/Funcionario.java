package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private Double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
