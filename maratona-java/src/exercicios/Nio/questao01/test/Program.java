package exercicios.Nio.questao01.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class Program {
    public static void main(String[] args) throws IOException {

        Path pathBase = Path.of("src/exercicios/Nio/questao01");
        Path pathProjetoIO = pathBase.resolve("projetoIO");
        Path pathDocs = pathProjetoIO.resolve("docs");
        Path pathFile = pathDocs.resolve("arquivo.txt");
        Path pathBackup = pathBase.resolve("Backup");

        // não lança exception caso já exista
        Files.createDirectories(pathDocs);
        Files.createDirectories(pathBackup);

        if (Files.notExists(pathFile)) {
            Files.createFile(pathFile);
        }

        // path relativo de docs para Backup
        Path pathDocToBackup = pathDocs.relativize(pathBackup);
        System.out.println("pathDocToBackup: " + pathDocToBackup.normalize());

        // reconstruindo o caminho
        Path reconstruindo = pathDocs.resolve(pathDocToBackup).normalize();
        System.out.println("Caminho reconstruindo: " + reconstruindo);

        // criando uma cópia do file de docs e alocando na pasta backup
        Files.copy(pathFile, pathBackup.resolve("backup.txt"), StandardCopyOption.REPLACE_EXISTING);

        // lendo os attributes do file com BasicFileAttributes
        BasicFileAttributes basicFileAttributes = Files.readAttributes(pathFile, BasicFileAttributes.class);
        System.out.println("\nis a Directory: " + basicFileAttributes.isDirectory());
        System.out.println("is a regular File: " + basicFileAttributes.isRegularFile());
        System.out.println("size file: " + basicFileAttributes.size());
        System.out.println("creation time: " + basicFileAttributes.creationTime());
        System.out.println("last modified time: " + basicFileAttributes.lastModifiedTime());
        System.out.println("last access time: " + basicFileAttributes.lastAccessTime());

        // modificando attributes do file com BasicFileAttributeView
        Instant now = Instant.now();
        FileTime fileTime = FileTime.from(now);
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(pathFile, BasicFileAttributeView.class);
        fileAttributeView.setTimes(fileTime, fileTime, fileTime);

        // Verificando se o Sistema suporta Dos
        System.out.println("\n" + FileSystems.getDefault().supportedFileAttributeViews());

        // alterando atributos mais específicos (hidden e read only) com DosFileAttributeView
        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(pathFile, DosFileAttributeView.class);
        System.out.println("\nis hidden? " + dosFileAttributeView.readAttributes().isHidden());
        System.out.println("is read only? " + dosFileAttributeView.readAttributes().isReadOnly());

        // alterando...
        dosFileAttributeView.setHidden(true);
        dosFileAttributeView.setReadOnly(true);

        System.out.println("\nis hidden? " + dosFileAttributeView.readAttributes().isHidden());
        System.out.println("is read only? " + dosFileAttributeView.readAttributes().isReadOnly());

        // desfazendo...
        Files.setAttribute(pathFile, "dos:hidden", false);
        Files.setAttribute(pathFile, "dos:readonly", false);

        System.out.println("\nis hidden? " + dosFileAttributeView.readAttributes().isHidden());
        System.out.println("is read only? " + dosFileAttributeView.readAttributes().isReadOnly());

    }
}