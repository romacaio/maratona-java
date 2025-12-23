package exercicios.poo.questao01.model;

public class AssistenteAdministrativo extends Assistente {

    private Turno turno;

    public AssistenteAdministrativo(String nome, double salario, String matricula, Turno turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public Turno getTurno() {
        return this.turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
