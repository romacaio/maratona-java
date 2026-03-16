package exercicios.poo.questao13.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int numero;
    private double valorTotal;
    private LocalDate data;
    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato(int numero, double valor, LocalDate data) {
        this.numero = numero;
        this.valorTotal = valor;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

}
