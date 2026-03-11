package javacore.Xserialization.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 4419691240406861216L;

    private Long id;
    private String nome;
    private transient String passWord;
    private final static String NOME_ESCOLA = "DevDojo Viradão no Jiraya";
    private transient Turma turma;

    public Aluno(Long id, String nome, String passWord) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.passWord = passWord;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            this.turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passWord='" + passWord + '\'' +
                ", NOME_ESCOLA=" + NOME_ESCOLA + '\'' +
                ", turma=" + turma + '\'' +
                '}';
    }
}
