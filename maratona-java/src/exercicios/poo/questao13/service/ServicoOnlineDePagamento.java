package exercicios.poo.questao13.service;

public interface ServicoOnlineDePagamento {

    double taxaPagamento(double valor);

    double juros(double valor, int meses);
}
