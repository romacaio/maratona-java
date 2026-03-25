package exercicios.colecoes.questao06.test;

import exercicios.colecoes.questao06.controller.PedidoController;
import exercicios.colecoes.questao06.service.PedidoService;

public class Aplicacao {
    public static void main(String[] args) {
        PedidoService service = new PedidoService();
        PedidoController controller = new PedidoController(service);

        // realizar pedidos
        controller.criarPedido("João", 500);
        controller.criarPedido("Maria", 1500);
        controller.criarPedido("Carlos", 300);
        controller.criarPedido("Ana", 2000);

        // busca por ID
        try {
            System.out.println(controller.buscarPedido(3)); // carlos
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // processar próximo pedido
        controller.procesarPedido(); // João
        controller.procesarPedido(); // Maria

        System.out.println();

        // Listar top3 pedidos (valor)
        controller.mostrarTop3();

        System.out.println();

        // listar todos (ordenado pela data)
        controller.listarPedidos();
    }
}
