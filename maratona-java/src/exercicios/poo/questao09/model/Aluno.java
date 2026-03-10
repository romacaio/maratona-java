package exercicios.poo.questao09.model;

public class Aluno {
    private String nome;
    private double[] notasTrimestre;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notasTrimestre = notas;
    }

    public double calcularNotas() {
        double soma = 0;
        for (double nota : notasTrimestre) {
            soma += nota;
        }
        return soma;
    }

    public double calcularPontosFaltaram() {
        return 60 - calcularNotas();
    }

    public void exibirResultado() {
        System.out.println("Aluno: " + nome);
        System.out.println("Final grade = " + calcularNotas());
        if (calcularNotas() > 60) System.out.println("PASS");
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", calcularPontosFaltaram());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotasTrimestre() {
        return notasTrimestre;
    }

    public void setNotasTrimestre(double[] notasTrimestre) {
        this.notasTrimestre = notasTrimestre;
    }
}
