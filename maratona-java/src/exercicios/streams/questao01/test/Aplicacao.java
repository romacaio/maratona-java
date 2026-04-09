package exercicios.streams.questao01.test;

import exercicios.streams.questao01.model.Pedido;
import exercicios.streams.questao01.model.Status;
import exercicios.streams.questao01.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Aplicacao {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>(List.of(
                new Pedido(1, Status.PENDENTE),
                new Pedido(2, Status.ENTREGUE),
                new Pedido(3, Status.PENDENTE),
                new Pedido(4, Status.ENTREGUE)
        ));

        // filtrar apenas os pedidos (Entregue)
        List<Pedido> list = pedidos.stream()
                .filter(p -> p.getStatusPedido() == Status.ENTREGUE)
                .toList();

        System.out.println(list);

        List<Usuario> usuarios = new ArrayList<>(List.of(
                new Usuario("Ana", 23, true),
                new Usuario("Bruno", 16, false),
                new Usuario("Carla", 34, true),
                new Usuario("Daniel", 28, true)
        ));

        // número de usuarios ativos com >= 18
        long count = usuarios.stream()
                .filter(user -> user.isAtivo() && user.getIdade() >= 18)
                .count();

        System.out.println(count);
    }

    // método genérico pra filtar
    private static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)
                .toList();
    }
}
