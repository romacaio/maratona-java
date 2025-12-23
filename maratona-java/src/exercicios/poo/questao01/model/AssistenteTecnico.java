package exercicios.poo.questao01.model;

public class AssistenteTecnico extends Assistente {
    private double bonus;

    public AssistenteTecnico(String nome, double salario, String matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
