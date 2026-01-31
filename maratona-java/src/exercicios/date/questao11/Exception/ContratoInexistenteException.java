package exercicios.date.questao11.Exception;

public class ContratoInexistenteException extends RuntimeException {

    public ContratoInexistenteException() {
        super("Contrato inexistente na lista desse trabalhador");
    }

    public ContratoInexistenteException(String mensagem) {
        super(mensagem);
    }

    public ContratoInexistenteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}
