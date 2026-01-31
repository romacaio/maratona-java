package javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        boolean sass = bundle.containsKey("sass");
        System.out.println(sass);
        System.out.println();

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        System.out.println();

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle.getString("hi"));


        /*
        Ordem de procura das chaves do bundleResource:

        exemplo -  ResourceBundle.getBundle("messages", new Locale("fr", "CA"));

        1. nomeBase_fr_CA.properties
        2. nomeBase_fr.properties
        3. nomeBase_pt_BR.properties  (Locale default)
        4. nomeBase_pt.properties
        5. nomeBase.properties

         */

    }
}
