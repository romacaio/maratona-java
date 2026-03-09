package javacore.Wnio.test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutStreamTest01 {
    public static void main(String[] args) {

        Path destinoArquivoZip = Path.of("pasta/arquivo.zip");
        Path arquivosParaZipar = Path.of("pasta/subpasta1/subsubpasta1");
        zip(destinoArquivoZip, arquivosParaZipar);
    }

    private static void zip(Path destinoArquivoZip, Path arquivosParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(destinoArquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com suceso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
