package exercicios.poo.questao05.model;

public class Vip extends Ingresso {
    private double valorAdicional;


    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void adicionalVip() {
        setValor(getValor() + valorAdicional);
    }

    @Override
    public void imprimeValor() {
        System.out.println("## Ingresso Vip ##");
        adicionalVip();
        super.imprimeValor();
    }

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
