package javacore.ZZBcomportamentos.interfaces;

import javacore.ZZBcomportamentos.dominio.Carro;

public interface CarroPredicate {

    public abstract boolean test(Carro carro);
}
