package exercicios.poo.questao12.model;

public abstract class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return nome + ": $ " + String.format("%.2f", calcularImposto());
    }
}
