package javacore.Zgenerics.service;

import java.util.List;

public class RentalSerive<T> {
    private List<T> objetosDisponiveis;

    public RentalSerive(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Busacando objeto disponível...");
        T t = objetosDisponiveis.remove(0);

        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);

        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo Objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
