package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        // forma antiga (antes do Java 11)
        Path p1 = Paths.get("C:\\Users\\romac\\OneDrive\\Documentos\\Estudo\\java\\maratona-java\\maratona-java\\file.txt");

        // pode receber um var args
        Path p2 = Paths.get("C:\\Users\\romac\\OneDrive\\Documentos\\Estudo\\java\\maratona-java\\maratona-java", "file.txt");
        Path p3 = Paths.get("C:", "\\Users\\romac\\OneDrive\\Documentos\\Estudo\\java\\maratona-java\\maratona-java", "file.txt");
        Path p4 = Paths.get("C:", "Users", "romac", "OneDrive", "Documentos", "Estudo", "java", "maratona-java", "maratona-java", "file.txt");

        // forma nova
        Path p5 = Path.of("C:Users\\romac\\OneDrive\\Documentos\\Estudo\\java\\maratona-java\\maratona-java,\\file.txt");
        Path p6 = Path.of("C:", "Users", "romac", "OneDrive", "Documentos", "Estudo", "java", "maratona-java", "maratona-java", "file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
        System.out.println(p5.getFileName());
        System.out.println(p6.getFileName());

    }
}
