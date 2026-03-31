package exercicios.poo.questao15.test.model;

public class Arco extends Arma implements Disparavel {

    private int flechas;

    public Arco(String nome, TipoMunicao tipoMunicao) {
        super(nome, TipoMunicao.FLECHA);
    }

    @Override
    public boolean atirar() {
        if (flechas != 0) {
            System.out.println("Flecha disparada!");
            flechas -= 1;
            return true;
        }
        return false;
    }

    public void adicionarFlechas(int numFlechas) {
        flechas += numFlechas;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }
}
