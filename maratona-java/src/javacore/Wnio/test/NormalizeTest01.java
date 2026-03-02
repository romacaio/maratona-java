package javacore.Wnio.test;

import java.nio.file.Path;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/caio/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Path.of(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Path.of("/home/./caio/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
