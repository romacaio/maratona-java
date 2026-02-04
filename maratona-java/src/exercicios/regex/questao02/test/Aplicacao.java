package exercicios.regex.questao02.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {

        String texto = "Relatório gerado em 15/05/2023. Revisão em 20-10-2023 e validade até 01.01.2024.";
        Pattern regex = Pattern.compile("[0-9]{1,2}[\\./-][0-9]{1,2}[\\./-][0-9]{4}");

        Matcher matcher = regex.matcher(texto);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
