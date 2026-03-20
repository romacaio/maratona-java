package javacore.Ycolecoes.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String nome;

    public Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Consumidor consumidor = (Consumidor) obj;
        return id.equals(consumidor.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
