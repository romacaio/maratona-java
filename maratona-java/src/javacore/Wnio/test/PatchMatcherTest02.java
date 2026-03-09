package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// uso em conjunto do PatchMacher e SimpleFileVisitor...

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PatchMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Path.of("");
        Path path = Files.walkFileTree(root, new FindAllTestJavaOrClass());
    }
}
