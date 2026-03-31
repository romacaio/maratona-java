package exercicios.poo.questao15.test.model;


public class Carregador {

    private int capacidadeMax;
    private TipoMunicao municaoSuportada;
    private int municoes;

    public Carregador(TipoMunicao municaoSuportada) {
        this.municaoSuportada = municaoSuportada;
    }

    public boolean isCarregado() {
        return municoes != 0;
    }

    public boolean isCheio() {
        return municoes == capacidadeMax;
    }

    public void consumirMunicao() {
        if (isCarregado()) municoes -= 1;
    }


    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public TipoMunicao getMunicaoSuportada() {
        return municaoSuportada;
    }

    public void setMunicaoSuportada(TipoMunicao municaoSuportada) {
        this.municaoSuportada = municaoSuportada;
    }

    public int getMunicoes() {
        return municoes;
    }

    public void setMunicoes(int municoes) {
        this.municoes = municoes;
    }
}
