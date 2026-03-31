package exercicios.poo.questao15.test.model;

public class Pistola extends Arma implements Disparavel, Recarregavel {

    private Carregador carregador;

    public Pistola(String nome, Carregador carregador) {
        super(nome, TipoMunicao.PISTOLA);
        if (carregador.getMunicaoSuportada() != TipoMunicao.PISTOLA) {
            throw new IllegalArgumentException("Carregador incompatível");
        }
        this.carregador = carregador;
        this.carregador.setCapacidadeMax(12);
    }

    @Override
    public boolean atirar() {
        if (carregador.isCarregado()) {
            carregador.consumirMunicao();
            System.out.println("Bala da pistola disparada.");
            return true;
        }
        return false;
    }

    @Override
    public boolean recarregar() {
        if (!carregador.isCarregado() || !carregador.isCheio()) {
            carregador.setMunicoes(carregador.getMunicoes() - 1);
            return true;
        }
        return false;
    }

    public Carregador getCarregador() {
        return carregador;
    }

    public void setCarregador(Carregador carregador) {
        this.carregador = carregador;
    }
}
