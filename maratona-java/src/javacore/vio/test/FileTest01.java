package javacore.vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("created: " + isCreated);
            System.out.println("patch: " + file.getPath());
            System.out.println("patch absolute: " + file.getAbsolutePath());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is file: " + file.isFile());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("is can read: " + file.canRead());
            System.out.println("is can write: " + file.canWrite());
            System.out.println("is can execute: " + file.canExecute());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if (file.exists()) {
                System.out.println("Deleted: " + file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
