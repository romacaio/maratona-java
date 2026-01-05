package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    private void mediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : this.salarios) {
            this.media += salario;
        }
        this.media /= salarios.length;
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
        mediaSalario();
        System.out.println("Média salários: R$ " + this.media);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return this.media;
    }

}
