package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        String regex1 = "ab";
        String regex2 = "aba";

        String texto1 = "abaaba";
        String texto2 = "abababa";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(texto1);

        System.out.println("Texto:   " + texto1);
        System.out.println("índice:  0123456789");
        System.out.println("regex: " + regex1);
        System.out.println("Posições econtradas");

        while (matcher1.find()) {
            System.out.print(matcher1.start() + " ");
        }

        System.out.println("\n");

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("Texto:   " + texto1);
        System.out.println("índice:  0123456789");
        System.out.println("regex: " + regex1);
        System.out.println("Posições econtradas");

        // não inclui os indíces que já deram match.
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " ");
        }
    }
}