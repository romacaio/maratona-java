package exercicios.poo.questao15.test.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Arma> armas = new ArrayList<>();

    public Pessoa(String nome, List<Arma> armas) {
        this.nome = nome;
        this.armas = armas;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void adicionarArma(Arma arma) {
        armas.add(arma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Arma> getArmas() {
        return armas;
    }

}
