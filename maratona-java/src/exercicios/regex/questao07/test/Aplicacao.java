package exercicios.regex.questao07.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {
        String texto = "R$ 1.250,50";

        // regex que verifica se o valor é válido
        Pattern regex = Pattern.compile("^R\\$\\s\\d+\\.?\\d+,\\d+");
        Matcher matcher = regex.matcher(texto);

        if(matcher.find()){
            String precoValido = matcher.group();
            System.out.println(precoValido);

            String regex2 = "[R\\$\\s\\.,]+";
            String preco = precoValido.replaceAll(regex2, "");
            System.out.println(preco);
        }

    }
}
