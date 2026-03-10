package exercicios.poo.questao10.model;

public class ProdutoImportado extends Produto {
    private double taxaAlfandega;

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public void etiquetaPreco() {
        System.out.printf("%s $%.2f (Taxa Alfândega: $%.2f)\n", super.getNome(), precoTotal(), taxaAlfandega);
    }

    public double precoTotal() {
        return super.getPreco() + taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
}
