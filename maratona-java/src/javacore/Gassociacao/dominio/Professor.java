package javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Professor: " + this.nome);
        if (seminarios == null) return;
        System.out.println("## Seminários Cadastrados ##");
        for (Seminario seminario : seminarios) {
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " - Idade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return this.seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
