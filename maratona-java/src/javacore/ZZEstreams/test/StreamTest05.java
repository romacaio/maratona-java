package javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {

        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = words.stream()
                .map(m -> m.split(""))  // return Stream<String[]>
                .flatMap(Arrays::stream) // return Stream<String>
                .toList();

        System.out.println(letters2);
    }
}
