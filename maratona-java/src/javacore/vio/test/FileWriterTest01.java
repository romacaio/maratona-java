package javacore.vio.test;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O Dev Dojo é lindo, é o melhor curso do brasilllll\nContinuando a cantoria na próxima linha\n");
            fw.flush(); // força a grvação imediata dos dados em Buffer, evita perda

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
