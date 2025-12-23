package exercicios.poo.questao03.model;

public enum DiaSemana {
    DOMINGO(true),
    SEGUNDA(false),
    TERCA(false),
    QUARTA(false),
    QUINTA(false),
    SEXTA(false),
    SABADO(true);

    private boolean isFimDeSemana;

    private DiaSemana(boolean isFimDeSemana) {
        this.isFimDeSemana = isFimDeSemana;
    }

    public boolean isFimDeSemana() {
        return isFimDeSemana;
    }

    public void setFimDeSemana(boolean fimDeSemana) {
        isFimDeSemana = fimDeSemana;
    }
}
