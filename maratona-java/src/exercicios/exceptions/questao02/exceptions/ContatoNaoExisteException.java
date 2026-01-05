package exercicios.exceptions.questao02.exceptions;

public class ContatoNaoExisteException extends Exception {

    private final String nomeNaoEncontrado;

    public ContatoNaoExisteException(String nomeNaoEncontrado) {
        super("O contato com o nome: " + nomeNaoEncontrado + " não existe na lista");
        this.nomeNaoEncontrado = nomeNaoEncontrado;
    }

    public ContatoNaoExisteException(String mensagem, String nomeNaoEncontrado) {
        super(mensagem);
        this.nomeNaoEncontrado = nomeNaoEncontrado;
    }
}
