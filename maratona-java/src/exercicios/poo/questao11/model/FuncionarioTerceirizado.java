package exercicios.poo.questao11.model;

public class FuncionarioTerceirizado extends Funcionario {
    private double custoAdicional;

    public FuncionarioTerceirizado(String nome, Integer horas, double valorPorHora, double custoAdicional) {
        super(nome, horas, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + custoAdicional * 1.1;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

}
