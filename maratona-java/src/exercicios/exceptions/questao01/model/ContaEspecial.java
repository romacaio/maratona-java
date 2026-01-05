package exercicios.exceptions.questao01.model;

import exercicios.exceptions.questao01.Exceptions.SaldoInsuficienteException;

public class ContaEspecial extends ContaBancaria {


    public ContaEspecial(String nome, int numeroConta, double saldo) {
        super(nome, numeroConta, saldo);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - 0.5);
        if (getSaldo() < valor) {
            throw new SaldoInsuficienteException();
        }
        setSaldo(getSaldo() - valor);
    }
}
