package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        // lista para array (toArray)
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-".repeat(20));

        /*
        array para lista (asList) -> cria um vínculo entre a lista criada e o array, quando alterado na
        lista no array original tbm é.

        Dessa forma ações que alteram o tamanho das listas, como: add, remove e clear acabam gerando exceção.
         */
        Integer[] integersArray = {1, 2, 3};
        List<Integer> arrayToList = Arrays.asList(integersArray);
        arrayToList.set(0, 12);

        System.out.println(Arrays.toString(integersArray));
        System.out.println(arrayToList);

        // Já dessa forma não vincula a lista com o array, permitindo todas as operações
        System.out.println("-".repeat(20));
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(integersArray));
        numerosList.add(15);
        System.out.println(numerosList);

        // aceita var args
        List<String> strings = Arrays.asList("1", "2", "3");
    }
}
