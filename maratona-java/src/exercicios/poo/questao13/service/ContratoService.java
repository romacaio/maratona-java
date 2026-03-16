package exercicios.poo.questao13.service;

import exercicios.poo.questao13.model.Contrato;
import exercicios.poo.questao13.model.Parcela;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContratoService {

    private ServicoOnlineDePagamento servicoOnlineDePagamento;
    public final static DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ContratoService(ServicoOnlineDePagamento servicoOnlineDePagamento) {
        this.servicoOnlineDePagamento = servicoOnlineDePagamento;
    }

    public void processarContrato(Contrato contrato, int meses) {
        double valorBaseParcelas = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i);
            double juros = servicoOnlineDePagamento.juros(valorBaseParcelas, i);
            double taxaPagamento = servicoOnlineDePagamento.taxaPagamento(valorBaseParcelas + juros);
            double valorParcela = valorBaseParcelas + juros + taxaPagamento;

            contrato.getParcelas().add(new Parcela(dataVencimento, valorParcela));
        }
    }
}
