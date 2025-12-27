package exercicios.poo.questao07.model;

public enum ClassificacaoImc {
    ABAIXO_DO_PESO(0.0, 18.5, "Abaixo do Peso"),
    PESO_NORMAL(18.5, 24.9, "Peso Normal"),
    SOBREPESO(25.0, 29.9, "Sobrepeso"),
    OBESIDADE_I(30.0, 34.9, "Obesidade Grau I"),
    OBESIDADE_II(35.0, 39.9, "Obesidade Grau II"),
    OBESIDADEIII(40.0, Double.MAX_VALUE, "Obesidade Grau III");
    private final double MIN;
    private final double MAX;
    private final String DESCRICAO;


    private ClassificacaoImc(double min, double max, String descricao) {
        this.MIN = min;
        this.MAX = max;
        this.DESCRICAO = descricao;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public boolean pertence(double imc) {
        return imc >= MIN && imc < MAX;
    }
}
