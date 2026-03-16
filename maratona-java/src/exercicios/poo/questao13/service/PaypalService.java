package exercicios.poo.questao13.service;

public class PaypalService implements ServicoOnlineDePagamento {
    private double taxaPagamento = 0.02;
    private double jurosSimplesMensal = 0.01;

    @Override
    public double juros(double valor, int meses) {
        return valor * jurosSimplesMensal * meses;
    }

    @Override
    public double taxaPagamento(double valor) {
        return valor * taxaPagamento;
    }

    public double getTaxaPagamento() {
        return taxaPagamento;
    }

    public double getJurosSimplesMensal() {
        return jurosSimplesMensal;
    }

}
