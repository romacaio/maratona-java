package exercicios.poo.questao15.test.model;

public abstract class Arma {
    private String nome;
    private TipoMunicao tipoSuportado;

    public Arma(String nome, TipoMunicao tipoMunicao) {
        this.nome = nome;
        this.tipoSuportado = tipoMunicao;
    }

    public void guardar() {
        System.out.println(nome + " guardado(a).");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoMunicao getTipoSuportado() {
        return tipoSuportado;
    }

    public void setTipoSuportado(TipoMunicao tipoSuportado) {
        this.tipoSuportado = tipoSuportado;
    }
}
