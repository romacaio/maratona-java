package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        /*
        \\d = todos os dígitos
        \\D = tudo que não for dígito (incluíndo caracters especiais: ex !#$@&()... )
        \\s = espaços em branco (ou \\t \\n \\f \\r)
        \\S = todos os caracters que não estão em branco
        \\w = a-z, A-Z, dígitos, _
        \\W = Tudo que não for incluso no \\w (basicamente os caracters especiais e espaços em branco)
         */

        String regex = "\\W";
        String texto = "@#hh_J2 1\t2gvh21";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:   " + texto);
        System.out.println("índice:  0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições econtradas");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
    }
}