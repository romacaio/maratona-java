package javacore.vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("O Dev Dojo é lindo, é o melhor curso do brasilllll");
            bw.newLine(); // nova linha usando o separador padrão do sistema
            bw.write("Continuando a cantoria na próxima linha");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

