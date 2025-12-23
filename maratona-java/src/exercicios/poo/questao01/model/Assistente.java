package exercicios.poo.questao01.model;

public abstract class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados(Funcionario funcionario) {
        Assistente assistente = (Assistente) funcionario;
        System.out.println("Dados do Assistente");
        System.out.println("\nNome: " + assistente.getNome());
        System.out.printf("Salário: R$ %.2f", assistente.getSalario());
        System.out.println("\nNúmero matrícula: " + assistente.getMatricula());
        System.out.printf("Ganho anual: R$ %.2f", assistente.ganhoAnual());
        if (assistente instanceof AssistenteAdministrativo) {
            AssistenteAdministrativo assistenteAdmin = (AssistenteAdministrativo) assistente;
            System.out.println("\nTurno: " + assistenteAdmin.getTurno());
            System.out.printf("Adicional noturno: R$ %.2f", assistenteAdmin.getTurno().getAdicionalNoturno());
        } else {
            AssistenteTecnico assistentetec = (AssistenteTecnico) assistente;
            System.out.printf("\nBônus: R$ %.2f", assistentetec.getBonus());
        }

    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
