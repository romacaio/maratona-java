package exercicios.poo.questao14.model;

public class Fatura {
    private double pagamentoBase;
    private double imposto;
    private double pagamentoTotal;

    public Fatura() {

    }

    public Fatura(double pagamentoBase, double imposto, double pagamentoTotal) {
        this.pagamentoBase = pagamentoBase;
        this.imposto = imposto;
        this.pagamentoTotal = pagamentoTotal;
    }

    public double getPagamentoBase() {
        return pagamentoBase;
    }

    public void setPagamentoBase(double pagamentoBase) {
        this.pagamentoBase = pagamentoBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getPagamentoTotal() {
        return pagamentoTotal;
    }

    public void setPagamentoTotal(double pagamentoTotal) {
        this.pagamentoTotal = pagamentoTotal;
    }

    @Override
    public String toString() {
        return "Fatura" + "\nPagamento Básico: " + String.format("%.2f", pagamentoBase) + "\nImposto: " + String.format("%.2f", imposto) +
                "\nPagamento Total: " + String.format("%.2f", pagamentoTotal);
    }
}
