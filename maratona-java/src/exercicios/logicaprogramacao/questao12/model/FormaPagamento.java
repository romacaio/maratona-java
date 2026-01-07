package exercicios.logicaprogramacao.questao12.model;

public enum FormaPagamento {
    AVISTA_DINHEIRO(0.15, 0.0),
    AVISTA_PIX(0.15, 0.0),
    AVISTA_CARTAO(0.10, 0.0),
    CARTAO_PARCELADO2X(0.0, 0.0),
    CARTAO_PARCELADO3X(0.0, 0.10);

    private double desconto;
    private double juros;

    private FormaPagamento(double desconto, double juros) {
        this.desconto = desconto;
        this.juros = juros;
    }

    public double valorPagamento(double valorProduto) {
        double desconto = valorProduto * this.desconto;
        double juros = valorProduto * this.juros;

        valorProduto -= desconto;
        valorProduto += juros;

        return valorProduto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getJuros() {
        return juros;
    }

}
