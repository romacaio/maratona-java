package javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de instância de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de instância de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("## Endereço ##");
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("Cep: " + this.endereco.getCep());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
