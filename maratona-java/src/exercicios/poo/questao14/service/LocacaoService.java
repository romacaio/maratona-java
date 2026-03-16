package exercicios.poo.questao14.service;

import exercicios.poo.questao14.model.Fatura;
import exercicios.poo.questao14.model.LocacaoVeiculo;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class LocacaoService {
    private double valorPorHora;
    private double valorPorDia;

    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private ImpostoService impostoService;


    public LocacaoService(double valorPorHora, double valorPorDia, ImpostoService impostoService) {
        this.valorPorHora = valorPorHora;
        this.valorPorDia = valorPorDia;
        this.impostoService = impostoService;
    }

    public void processarLocacao(LocacaoVeiculo locacaoVeiculo) {
        double minutos = Duration.between(locacaoVeiculo.getCheckIn(), locacaoVeiculo.getCheckOut()).toMinutes();
        double horas = minutos / 60.00;

        double pagamentoBase;
        if (horas <= 12) {
            pagamentoBase = valorPorHora * Math.ceil(horas);
        } else {
            pagamentoBase = Math.ceil(horas / 24d) * valorPorDia;
        }

        double imposto = impostoService.imposto(pagamentoBase);
        locacaoVeiculo.setFatura(new Fatura(pagamentoBase, imposto, pagamentoBase + imposto));
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    public ImpostoService getImpostoService() {
        return impostoService;
    }

    public void setImpostoService(ImpostoService impostoService) {
        this.impostoService = impostoService;
    }
}
