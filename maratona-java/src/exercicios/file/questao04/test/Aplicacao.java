package exercicios.file.questao04.test;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) {

        Pattern regex = Pattern.compile("(?= ERROR).* \\(ID:\\s(?<id>\\d+)\\)");

        File fileSistemaLog = new File("src\\exercicios\\file/arquivos\\sistema.log");
        File fileErrosID = new File("src\\exercicios\\file/arquivos\\erros_id.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(fileSistemaLog));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileErrosID))) {

            fileErrosID.createNewFile();

            String linha;
            while ((linha = br.readLine()) != null) {
                Matcher matcher = regex.matcher(linha);
                if (matcher.find()) {
                    bw.write(matcher.group("id"));
                    bw.newLine();
                }
            }
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
