package exercicios.colecoes.questao06.service;

import exercicios.colecoes.questao06.model.Pedido;

import java.time.LocalDateTime;
import java.util.*;

public class PedidoService {

    private Map<Integer, Pedido> pedidosPorId = new HashMap<>();
    private NavigableMap<LocalDateTime, List<Pedido>> pedidosPorData = new TreeMap<>();
    private Queue<Pedido> filaProcessamento = new ArrayDeque<>();
    private Queue<Pedido> topPedidos = new PriorityQueue<>();

    public void adicionarPedido(Pedido pedido) {
        // HashMap(busca Rápida)
        pedidosPorId.put(pedido.getId(), pedido);

        // treeMap(ordenado por data)
        if (!pedidosPorData.containsKey(pedido.getData())) {
            pedidosPorData.put(pedido.getData(), new ArrayList<>());
            pedidosPorData.get(pedido.getData()).add(pedido);

        } else {
            pedidosPorData.get(pedido.getData()).add(pedido);
        }

        // Queue(Fila de processamento)
        filaProcessamento.offer(pedido);

        // QueuePriority(top3 Pedidos)
        topPedidos.offer(pedido);
        if (topPedidos.size() > 3) {
            topPedidos.poll();
        }
    }

    public Pedido processarProximo() {
        return filaProcessamento.poll();
    }

    public Pedido buscarPorId(int id) {
        return pedidosPorId.get(id);
    }


    public List<Pedido> top3Maiores() {
        return new ArrayList<>(topPedidos);
    }

    public List<Pedido> listarPorData() {
        List<Pedido> lista = new ArrayList<>();
        for (List<Pedido> pedidos : pedidosPorData.values()) {
            lista.addAll(pedidos);
        }
        return lista;
    }


}
