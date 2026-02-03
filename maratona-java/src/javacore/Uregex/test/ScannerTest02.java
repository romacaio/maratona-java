package javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,eren,mikasa,true,200";
        Scanner sc = new Scanner(texto); // delimitador padrão é espaço vazio
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("Boolean " + b);
            } else if (sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("Int " + i);
            }else {
                System.out.println(sc.next());
            }
        }
    }
}
