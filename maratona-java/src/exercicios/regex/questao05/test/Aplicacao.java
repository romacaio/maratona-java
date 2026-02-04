package exercicios.regex.questao05.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        Pattern regex = Pattern.compile("^[a-zA-Z]+\\s[a-zA-Z]+$");
        Matcher matcher = regex.matcher(nome);

        if (matcher.find()) {
            System.out.println("Nome válido!");
            System.out.println(matcher.group());
        } else {
            System.out.println("Nome inválido!");
        }
    }
}
