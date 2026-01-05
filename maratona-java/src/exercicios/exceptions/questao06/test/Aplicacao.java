package exercicios.exceptions.questao06.test;

import java.io.IOException;

public class Aplicacao {
    public static void main(String[] args) {
        try {
            lerArquivo("file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void lerArquivo(String nome) throws IOException {

    }
}
