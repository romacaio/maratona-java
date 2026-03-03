package javacore.Wnio.test;

import java.nio.file.Path;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Path.of("/home/caio");
        Path classe = Path.of("/home/caio/devdojofoda/OlaMundo.java");
        Path dirToClasse = dir.relativize(classe);

        System.out.println(dirToClasse);

        Path absolute1 = Path.of("/home/caio");
        Path absolute2 = Path.of("/usr/local");
        Path absolute3 = Path.of("/home/caio/devdojofoda/OlaMundo.java");
        Path relative1 = Path.of("temp");
        Path relative2 = Path.of("temp/temp.2021921");

        System.out.println("1: " + absolute1.relativize(absolute3));
        System.out.println("2: " + absolute3.relativize(absolute1));
        System.out.println("3: " + absolute1.relativize(absolute2));
        System.out.println("4: " + relative1.relativize(relative2));


    }
}
