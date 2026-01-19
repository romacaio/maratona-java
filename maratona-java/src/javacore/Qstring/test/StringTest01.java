package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "William";
        String nome2 = "William";
        nome = nome.concat(" Suane");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("William"); // 1 - cria uma referência 2 - objeto do tipo String 3 - Uma String no pool
        System.out.println(nome2 == nome3);

        System.out.println(nome2 == nome3.intern());
    }
}
