package exercicios.generics.questao03.model;

public class ObjetoArmazenado<T> {
    private T t;

    public ObjetoArmazenado(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
