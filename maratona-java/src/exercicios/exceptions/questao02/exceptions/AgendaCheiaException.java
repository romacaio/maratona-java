package exercicios.exceptions.questao02.exceptions;

public class AgendaCheiaException extends Exception {

    public AgendaCheiaException() {
        super("A agenda está cheia");
    }

    public AgendaCheiaException(String mensagem) {
        super(mensagem);
    }
}
