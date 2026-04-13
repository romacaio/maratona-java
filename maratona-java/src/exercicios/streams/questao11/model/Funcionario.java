package exercicios.streams.questao11.model;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String departamento;
    private int idade;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String departamento, int idade, double salario, boolean ativo) {
        this.nome = nome;
        this.departamento = departamento;
        this.idade = idade;
        this.salario = salario;
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Funcionario funcionario = (Funcionario) obj;
        return this.getNome().equals(funcionario.getNome()) && this.getIdade() == funcionario.getIdade()
                && this.getDepartamento().equals(funcionario.getDepartamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, departamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", ativo=" + ativo +
                '}';
    }
}
