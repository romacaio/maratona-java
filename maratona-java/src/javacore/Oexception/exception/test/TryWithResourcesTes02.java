package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.Leitor1;
import javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTes02 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
