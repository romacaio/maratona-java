package javacore.Wnio.test;

import java.nio.file.Path;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Path.of("home/Caio");
        Path file = Path.of("dev/arquivo.txt");
        Path resolve = dir.resolve(file);

        System.out.println(resolve);

        Path absolute = Path.of("/home/caio");
        Path relative = Path.of("dev");
        Path file2 = Path.of("file.txt");

        System.out.println("1. " + absolute.resolve(relative));
        System.out.println("2. " + absolute.resolve(file2));

        System.out.println("3. " + relative.resolve(absolute));
        System.out.println("4. " + relative.resolve(file2));

        System.out.println("4. " + file2.resolve(absolute));
        System.out.println("4. " + file.resolve(relative));
    }
}
