package exercicios.colecoes.questao03.model;

import java.util.concurrent.ThreadLocalRandom;

public class Produto implements Comparable<Produto> {
    private final Integer ID;
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.ID = ThreadLocalRandom.current().nextInt(0, 1000);
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Produto p = (Produto) obj;
        return this.ID.equals(p.getId());
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }

    @Override
    public int compareTo(Produto o) {
        return this.nome.compareTo(o.getNome());
    }

    public Integer getId() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
