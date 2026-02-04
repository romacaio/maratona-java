package exercicios.regex.questao06.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {
        String texto = "(11) 98888-7777, (21) 97777-6666.";

        Pattern regex = Pattern.compile("\\((\\d{2})\\)");
        Matcher matcher = regex.matcher(texto);

        while (matcher.find()) {
            System.out.println("DD extraído: " +matcher.group(1));
        }
    }
}
