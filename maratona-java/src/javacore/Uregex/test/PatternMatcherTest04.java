package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        /*

        \d = todos os dígitos
        \D = tudo que não for dígito (incluíndo caracters especiais: ex !#$@&()... )
        \s = espaços em branco (ou \t \n \f \r)
        \S = todos os caracters que não estão em branco
        \w = a-z, A-Z, dígitos, _
        \W = Tudo que não for incluso no \\w (basicamente os caracters especiais e espaços em branco)

        quantificadores:

        ? = zero ou uma ocorrência
        * = zero ou mais ocorrências
        + = uma ou mais ocorrências
        {n,m} = de n até m
        () = agrupamento
        | = ou -> ex: o(v|c)o match em ovo e oco
        $ = fim da linha

         */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

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