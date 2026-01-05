package exercicios.exceptions.questao01.test;

import exercicios.exceptions.questao01.Exceptions.SaldoInsuficienteException;
import exercicios.exceptions.questao01.model.ContaBancaria;
import exercicios.exceptions.questao01.model.ContaEspecial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoConta;
        String titular;
        int numeroConta;
        double saldo;

        while (true) {
            try {
                System.out.println("Qual o seu tipo de conta:");
                System.out.println("[1] - Conta Bancária\n[2] - Conta Especial");
                tipoConta = sc.nextInt();
                sc.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Digite um tipo de conta válida\n");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Titular da conta: ");
                titular = sc.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println("Digite um nome de titular válido\n");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Número da conta: ");
                numeroConta = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Digite um número de conta válido\n");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Saldo da conta: ");
                saldo = sc.nextDouble();
                if (saldo < 0) throw new IllegalArgumentException();

            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Digite um saldo para conta válido.\n");
                sc.nextLine();
                continue;
            }
            break;
        }

        ContaBancaria conta;

        if (tipoConta == 1) {
            conta = new ContaBancaria(titular, numeroConta, saldo);
        } else {
            conta = new ContaEspecial(titular, numeroConta, saldo);
        }

        int op;
        while (true) {
            try {
                System.out.println("O que deseja fazer: ");
                System.out.println("[1] - Saque\n[2] - Depósito");
                op = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Digite uma ação válida\n");
                sc.nextLine();
                continue;
            }
            break;
        }

        if (op == 1) {
            while (true) {
                try {
                    System.out.println("Digite o valor do saque: ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);

                } catch (SaldoInsuficienteException e) {
                    System.out.println(e.getMessage() + "\n");
                    sc.nextLine();
                    continue;

                } catch (InputMismatchException e) {
                    System.out.println("Digite um valor válido para o saque\n");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        } else {
            while (true) {
                try {
                    System.out.println("Digite o valor do depósito: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                } catch (InputMismatchException e) {
                    System.out.println("Digite um valor válido para o depósito\n");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        }
        System.out.printf("\nSaldo atual: %.2f", conta.getSaldo());
    }

}
