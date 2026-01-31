package exercicios.date.questao11.model;

import java.time.LocalDate;

public class ContratoPorHora {
    private LocalDate data;
    private double valorPorHora;
    private int horas;

    public ContratoPorHora(LocalDate data, double valorPorHora, int horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public double valorTotal() {
        return valorPorHora * horas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
