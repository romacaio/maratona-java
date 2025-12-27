package exercicios.poo.questao05.model;

public class CamaroteSuperior extends Vip {
    private String localizacao;
    private double valorCamarote;

    public CamaroteSuperior(double valor, double valoradicional, String localizacao, double valorCamarote) {
        super(valor, valoradicional);
        this.localizacao = localizacao;
        this.valorCamarote = valorCamarote;
    }

    public void adicionalCamarote() {
        setValor(getValor() + valorCamarote);
    }

    @Override
    public void imprimeValor() {
        adicionalCamarote();
        super.imprimeValor();
    }


    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getAdicionalCamarote() {
        return this.valorCamarote;
    }

    public void setAdicionalCamarote(double adicionalCamarote) {
        this.valorCamarote = adicionalCamarote;
    }
}
