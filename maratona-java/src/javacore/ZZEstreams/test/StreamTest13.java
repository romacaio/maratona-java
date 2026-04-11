package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LigthNovel;
import javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest13 {
    private static List<LigthNovel> ligthNovel = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LigthNovel("Overlod", 10.99, Category.FANTASY),
            new LigthNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LigthNovel("No game no life", 2.99, Category.FANTASY),
            new LigthNovel("FullMetal Alchemist", 5.99, Category.FANTASY),
            new LigthNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LigthNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LigthNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    /*
    No exemplo da aula passada utilizamos como chave um atributo existente na classe (LigthNovel),
    nesse exemplo estamos usando uma Enum (Promotion) não existente nela.

    Por isso, temos que fazer uma lógica a mais, onde caso o ln.getPrice() seja menor que 6 passamos -> UNDER_PROMOTION
//    como chave e caso seja maior passamos -> NORMAL_PRICE
     */
    public static void main(String[] args) {
        Map<Promotion, List<LigthNovel>> collect = ligthNovel.stream()
                .collect(Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                ));

        System.out.println(collect);

        /*

        Map<Category,Map<Promotion,List<LigthNovel>>>
        - O map principal usa a Categoria como chave
        - Pra cada categoria temos segundo map, onde a chave é uma Promoção
        - pra cada promoção dentro de uma categoria tem uma lista de LigthNovel

         */

        Map<Category, Map<Promotion, List<LigthNovel>>> collect1 = ligthNovel.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.groupingBy(StreamTest13::getPromotion)));

        System.out.println(collect1);
    }

    public static Promotion getPromotion(LigthNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}

