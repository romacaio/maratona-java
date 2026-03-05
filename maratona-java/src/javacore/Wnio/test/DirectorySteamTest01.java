package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectorySteamTest01 {
    public static void main(String[] args) {

        Path dir = Path.of(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) { // aceita outro parâmetro como filtro usando glob pattern
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Basicamente Substitui o File.list do antigo pacote Java.IO, sendo mais performático
}
