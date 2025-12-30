package javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {

        criarNovoFile();
    }

    public static void criarNovoFile() throws IOException {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;

        }
    }
}
