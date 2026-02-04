package exercicios.regex.questao04.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {

        String cpf = "123.456.789-00";
        Pattern regex = Pattern.compile("(\\d{3}\\.){2}\\d{3}-\\d{2}");
        Matcher matcher = regex.matcher(cpf);

        if (matcher.find()) {
            System.out.println("CPF válido");
            System.out.println(matcher.group());
        } else {
            System.out.println("CPF inválido");
        }
    }
}
