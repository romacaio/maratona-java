package exercicios.regex.questao01.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuário: ");
        String usuario = scanner.nextLine().trim();

        Pattern regex = Pattern.compile("^[a-z]([a-z0-9]){4,11}$");
        Matcher matcher = regex.matcher(usuario);

        if (matcher.find()) {
            System.out.println("Usuário válido!");
            System.out.println(matcher.group());

        } else {
            System.out.println("Usuário inválido!");
        }

    }
}
