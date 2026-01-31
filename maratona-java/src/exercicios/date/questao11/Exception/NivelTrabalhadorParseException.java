package exercicios.date.questao11.Exception;

import java.text.ParseException;

public class NivelTrabalhadorParseException extends IllegalArgumentException {

    public NivelTrabalhadorParseException() {
        super("Nivel Trabalhador inexistente");
    }

    public NivelTrabalhadorParseException(String mensagem) {
        super(mensagem);
    }

    public NivelTrabalhadorParseException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
