package exercicios.file.questao02.test;

import java.io.*;

public class Aplicacao {
    public static void main(String[] args) {

        File file = new File("src\\exercicios\\file\\arquivos\\origem.txt");
        File copia = new File("src\\exercicios\\file\\arquivos\\copia_origem.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(copia))) {

            copia.createNewFile();

            String linha;
            while ((linha = br.readLine()) != null) {
                bw.write(linha + System.lineSeparator());
            }

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
