package exercicios.colecoes.questao06.model;

import java.time.LocalDateTime;

public class Pedido implements Comparable<Pedido> {
    private static int contador = 1;
    private final int id;
    private String cliente;
    private double valor;
    private LocalDateTime data;

    public Pedido(String cliente, double valor, LocalDateTime data) {
        this.id = contador++;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }

    @Override
    public int compareTo(Pedido o) {
        return Double.compare(this.valor, o.valor);
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pedido.contador = contador;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
