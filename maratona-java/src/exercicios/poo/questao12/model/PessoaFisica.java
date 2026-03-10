package exercicios.poo.questao12.model;

public class PessoaFisica extends Contribuinte {
    private double gastoSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto = getRendaAnual() < 20000.00 ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25;
        imposto = imposto - (gastoSaude * 0.5);

        if(imposto < 0.0){
            imposto = 0;
        }
        return imposto;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

}
