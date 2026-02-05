package exercicios.regex.questao08.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Senha: ");
        String senha = sc.nextLine();

        Pattern regex = Pattern.compile("^(?!.*\\W)(?=.*\\d).{6,10}");
        Matcher matcher = regex.matcher(senha);

        if(matcher.find()){
            System.out.println("Senha válida!");
            System.out.println(matcher.group());
        }else{
            System.out.println("Senha inválida!");
        }
    }
}
