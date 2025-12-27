package exercicios.poo.questao07.model;

public class Cliente {
    private String nome;
    private double altura;
    private double peso;
    private double imc;

    public Cliente(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return String.format("Nome: " + this.nome +
                "\nAltura: " + this.altura +
                "\nPeso: " + this.peso +
                "\nIMC: %.2f", this.imc);
    }
}
