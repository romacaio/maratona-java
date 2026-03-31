package exercicios.poo.questao15.test.model;


public class Fuzil extends Arma implements Disparavel, Recarregavel {
    private Carregador carregador;

    public Fuzil(String nome, Carregador carregador) {
        super(nome, TipoMunicao.FUZIL);
        if (carregador.getMunicaoSuportada() != TipoMunicao.FUZIL) {
            throw new IllegalArgumentException("Carregador incompatível");
        }
        this.carregador = carregador;
        this.carregador.setCapacidadeMax(30);
    }

    @Override
    public boolean recarregar() {
        if (!carregador.isCarregado() || !carregador.isCheio()) {
            carregador.setMunicoes(carregador.getMunicoes() + 30);
            return true;
        }
        return false;
    }

    @Override
    public boolean atirar() {
        if (carregador.isCarregado()) {
            carregador.consumirMunicao();
            System.out.println("Bala de Fuzil disparada.");
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
