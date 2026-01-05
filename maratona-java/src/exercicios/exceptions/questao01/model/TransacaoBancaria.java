package exercicios.exceptions.questao01.model;

public interface TransacaoBancaria {


    void depositar(double valor);

    void sacar(double valor);

    double getSaldo();

}
