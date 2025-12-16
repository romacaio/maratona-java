package javacore.Jmodificadorfinal.dominio;

public class Comprador {
    String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome;
    }
}
