package exercicios.poo.questao13.model;

import exercicios.poo.questao13.service.ContratoService;

import java.time.LocalDate;

public class Parcela {
    private LocalDate dataParcela;
    private double valorParcela;

    public Parcela() {

    }

    public Parcela(LocalDate dataParcela, double valorParcela) {
        this.dataParcela = dataParcela;
        this.valorParcela = valorParcela;
    }

    public LocalDate getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(LocalDate dataParcela) {
        this.dataParcela = dataParcela;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return ContratoService.dft.format(dataParcela) + " - " + String.format("%.2f", valorParcela);
    }
}
