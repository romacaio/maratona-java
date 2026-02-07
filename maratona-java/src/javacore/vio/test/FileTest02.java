package javacore.vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("pasta");
        boolean isDirectoryCread = directory.mkdir();
        System.out.println("diretório foi criado? " + isDirectoryCread);

        File fileDirectory = new File(directory, "file.txt");
        boolean isFileCread = fileDirectory.createNewFile();
        System.out.println("file dentro do diretório foi criado? " + isFileCread);

        File fileRenamed = new File(directory, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileDirectory.renameTo(fileRenamed);
        System.out.println("file foi renomeado? " + isFileRenamed);

        File directoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = directory.renameTo(directoryRenamed);
        System.out.println("Diretório foi renomeado? " + isDirectoryRenamed);

    }
}
