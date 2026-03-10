package javacore.Xserialization.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private String passWord;

    public Aluno(Long id, String nome, String passWord) {
        this.id = id;
        this.nome = nome;
        this.passWord = passWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
