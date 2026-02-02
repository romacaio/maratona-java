package javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest02 {
    public static void main(String[] args) {

        Locale locale = Locale.US;
        //Locale locale = Locale.of("pt", "BR");

        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        boolean loginOk = true;

        if (loginOk) {
            System.out.println(bundle.getString("login.sucesso"));
        } else {
            System.out.println(bundle.getString("login.erro"));
        }
    }
}
