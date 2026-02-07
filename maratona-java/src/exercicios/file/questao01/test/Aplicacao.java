package exercicios.file.questao01.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];
        System.out.println("## Diário ##");

        for (int i = 0; i < frases.length; i++) {
            System.out.println("Digite a " + (i + 1) + "°" + " frase: ");
            frases[i] = sc.nextLine();
        }

        File file = new File("src\\exercicios\\file\\arquivos\\diario.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            file.createNewFile();
            for (String frase : frases) {
                bw.write(frase);
                bw.flush();
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
