package exercicios.logicaprogramacao.questao09.model;

public enum AvaliacaoIMC {
    ABAIXO_DO_PESO(0.0, 18.5, "Abaixo do peso"),
    PESO_IDEAL(18.6, 24.9, "Peso ideal"),
    LEVEMENTE_ACIMA(25.0, 29.9, "Levemente acima do peso"),
    OBESIDADE_GRAUI(30.0, 34.9, "Obesidade Grau I"),
    OBESIDADE_GRAUII(35.0, 39.9, "Obesidade Grau II"),
    OBESIDADE_GRAUIII(40.0, Double.MAX_VALUE, "Obesidade Grau III");

    private final double MIN;
    private final double MAX;
    private String nomeRelatorio;

    private AvaliacaoIMC(double min, double max, String nomeRelatorio) {
        this.MIN = min;
        this.MAX = max;
        this.nomeRelatorio = nomeRelatorio;
    }

    public boolean avaliar(double imc) {
        return imc >= MIN && imc <= MAX;
    }

    public double getMIN() {
        return MIN;
    }

    public double getMAX() {
        return MAX;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
