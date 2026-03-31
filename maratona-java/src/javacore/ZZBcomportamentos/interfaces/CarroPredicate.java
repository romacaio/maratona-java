package javacore.ZZBcomportamentos.interfaces;

import javacore.ZZBcomportamentos.dominio.Carro;

@FunctionalInterface
public interface CarroPredicate {

    // Lambdas: são anonimas, funções, deixar o código mais conciso
    public abstract boolean test(Carro carro);

    /*
    (parametro) -> (expressão)
    (Carro carro) -> (carro.getCor().equals("verde"));

    forma abreviada:
    carro -> carro.getCor().equals("verde")

 */

}
