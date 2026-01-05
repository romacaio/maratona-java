package exercicios.exceptions.questao02.model;

public class Contato {
    private static int contador = 0;

    private final int ID;
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ID = contador + 1;

        contador += 1;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[ID: " + this.ID + ", Nome: " + this.nome + ", Telefone: " + this.telefone +
                ", Email: " + getEmail() + "]";
    }
}
