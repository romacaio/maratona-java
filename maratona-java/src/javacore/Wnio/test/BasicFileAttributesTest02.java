package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("pasta2/novo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        // utiliza um objeto do tipo WindowsFileAttributes (pois estou rodando no Windows)
        // BasicFileAttributes, DosFileAttributes e PosixFileAttributes são apenas para leitura dos Attributes
        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifieldTime: " + lastModifiedTime);
        System.out.println("LastAccessTime: " + lastAccessTime);

        System.out.println("-".repeat(50));

        // BasicFileAttributesView, DosFileAttributeView e PosixFileAttributes são para escrita
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastModifiedTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(newLastModifiedTime, lastAccessTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifieldTime: " + lastModifiedTime);
        System.out.println("LastAccessTime: " + lastAccessTime);

    }
}
