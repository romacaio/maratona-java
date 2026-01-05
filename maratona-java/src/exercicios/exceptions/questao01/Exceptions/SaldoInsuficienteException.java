package exercicios.exceptions.questao01.Exceptions;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException() {
        super("Tentativa de saque com saldo insuficiente");
    }

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }

    public SaldoInsuficienteException(Throwable causa) {
        super(causa);
    }

    public SaldoInsuficienteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
