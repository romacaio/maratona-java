package exercicios.colecoes.questao06.controller;

import exercicios.colecoes.questao06.model.Pedido;
import exercicios.colecoes.questao06.service.PedidoService;

import java.time.LocalDateTime;

public class PedidoController {
    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor, LocalDateTime.now());
        service.adicionarPedido(pedido);

    }

    public void procesarPedido() {
        System.out.println("Processando..." + service.processarProximo());
    }

    public Pedido buscarPedido(int id) {
        Pedido pedido = service.buscarPorId(id);
        if (pedido == null) {
            throw new RuntimeException("Pedido com ID inexistente.");
        }
        return pedido;
    }

    public void listarPedidos() {
        for (Pedido pedido : service.listarPorData()) {
            System.out.println(pedido);
        }
    }

    public void mostrarTop3() {
        for (Pedido pedido : service.top3Maiores()) {
            System.out.println(pedido);
        }
    }

}
