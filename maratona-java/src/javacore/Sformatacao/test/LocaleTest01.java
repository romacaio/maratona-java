package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("ch", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália " + df.format(cal.getTime()));
        System.out.println("Suíça " + df2.format(cal.getTime()));
        System.out.println("Índia " + df3.format(cal.getTime()));
        System.out.println("Japão " + df4.format(cal.getTime()));
        System.out.println("Holanda " + df5.format(cal.getTime()));

        System.out.println(localeItaly.getDisplayCountry(Locale.ENGLISH));
        System.out.println(localeItaly.getDisplayCountry()); // usa locale padrão do sistema
        System.out.println(localeJapao.getDisplayLanguage(localeItaly));
    }
}
