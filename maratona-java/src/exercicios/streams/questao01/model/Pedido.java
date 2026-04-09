package exercicios.streams.questao01.model;

public class Pedido {
    private final Integer id;
    private Status statusPedido;

    public Pedido(Integer id, Status status) {
        this.id = id;
        this.statusPedido = status;
    }

    public Integer getId() {
        return id;
    }

    public Status getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(Status statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", statusPedido=" + statusPedido +
                '}';
    }
}
