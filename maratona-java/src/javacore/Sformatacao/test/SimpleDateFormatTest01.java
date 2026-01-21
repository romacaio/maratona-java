package javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdam 21 de janeiro de 2026")); // parse return Date
            System.out.println(sdf2.parse("14/12/2005"));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
