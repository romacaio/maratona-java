package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        /*
        \\d = todos os dígitos
        \\D = tudo que não for dígito (incluíndo caracters especiais: ex !#$@&()... )
        \\s = espaços em branco (ou \\t \\n \\f \\r)
        \\S = todos os caracters que não estão em branco
        \\w = a-z, A-Z, dígitos, _
        \\W = Tudo que não for incluso no \\w (basicamente os caracters especiais e espaços em branco)
         */

        String regex1 = "[a-zA-C]";
        String regex2 = "0[xX][0-9a-fA-F]";

        String texto1 = "cafeBABE";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:   " + texto2);
        System.out.println("índice:  0123456789");
        System.out.println("regex: " + regex2);
        System.out.println("Posições econtradas");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }

    }
}