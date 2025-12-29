package javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

        criarNovoFile();
    }

    public static void criarNovoFile() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
