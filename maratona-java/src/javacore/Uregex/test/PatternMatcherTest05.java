package javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        /*

        \d = todos os dígitos
        \D = tudo que não for dígito (incluíndo caracters especiais: ex !#$@&()... )
        \s = espaços em branco (ou \t \n \f \r)
        \S = todos os caracters que não estão em branco
        \w = a-z, A-Z, dígitos e _
        \W = Tudo que não for incluso no \\w (basicamente os caracters especiais e espaços em branco)
        . = caractere coringa

        quantificadores:

        ? = zero ou uma ocorrência
        * = zero ou mais ocorrências
        + = uma ou mais ocorrências
        {n,m} = de n até m
        () = agrupamento
        | = ou -> ex: o(v|c)o match em ovo e oco
        $ = fim da linha

         */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.br, teste@gmail.com.br, sakura@gmail";

        System.out.println("Email válido?");
        System.out.println("#@!zoro@gmail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println();

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