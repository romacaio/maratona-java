package exercicios.poo.questao10.model;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {

    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void etiquetaPreco() {
        System.out.printf("%s $%.2f\n", nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
