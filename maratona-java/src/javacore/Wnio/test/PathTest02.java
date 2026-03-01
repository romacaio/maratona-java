package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Path.of("pasta");

        if (Files.notExists(pastaPath)) {
            Files.createDirectory(pastaPath);
        }

        // directory
        Path subPastaPath = Path.of("pasta\\subpasta\\subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        // file
        Path filePath = Path.of(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Path.of(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
