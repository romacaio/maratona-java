package exercicios.colecoes.questao02.model;

import java.util.Objects;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private Tipo tipo;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return this.getNome().equals(paciente.getNome()) && this.getTipo().equals(paciente.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo);
    }

    @Override
    public int compareTo(Paciente o) {
        if (this.getTipo().equals(o.getTipo())) return 0;
        else if (this.getTipo().equals(Tipo.PRIORITARIO) && o.getTipo().equals(Tipo.NORMAL)) return -1;
        else return 1;
    }

    public Paciente(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
