package exercicios.regex.questao09.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {
        String email = "usuario@lixo.com";
        Pattern regex = Pattern.compile("^.*@(?!lixo\\.com).*$");
        Matcher matcher = regex.matcher(email);

        if (matcher.find()) {
            System.out.println("Email válido!");
            System.out.println(matcher.group());
        } else {
            System.out.println("Email inválido");
        }
    }
}
