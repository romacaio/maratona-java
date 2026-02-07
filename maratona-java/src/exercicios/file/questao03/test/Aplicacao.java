package exercicios.file.questao03.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Aplicacao {
    public static void main(String[] args) {

        File file = new File("src\\exercicios\\file\\arquivos\\config.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                if (linha.contains(":")) {
                    String[] split = linha.split(":");
                    System.out.println(split[1]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
