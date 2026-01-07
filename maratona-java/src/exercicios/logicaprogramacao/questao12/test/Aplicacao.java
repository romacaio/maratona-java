package exercicios.logicaprogramacao.questao12.test;

import exercicios.logicaprogramacao.questao12.model.FormaPagamento;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.println("Forma de pagamento:");
        System.out.println("1 - À vista (Dinheiro ou Pix) - 15% de desconto");
        System.out.println("2 - À vista no cartão de crédito - 10% de desconto");
        System.out.println("3 - Cartão em 2x - sem juros");
        System.out.println("4 - Cartão em 3x ou mais - 10% de juros");

        System.out.print("Escolha a opção: ");
        int op = sc.nextInt();

        double valorTotal = 0;
        switch (op) {
            case 1:
                valorTotal = FormaPagamento.AVISTA_PIX.valorPagamento(valor);
                break;
            case 2:
                valorTotal = FormaPagamento.AVISTA_CARTAO.valorPagamento(valor);
                break;
            case 3:
                valorTotal = FormaPagamento.CARTAO_PARCELADO2X.valorPagamento(valor);
                break;
            case 4:
                valorTotal = FormaPagamento.CARTAO_PARCELADO3X.valorPagamento(valor);
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }

        System.out.printf("Valor final a pagar: R$ %.2f", valorTotal);

        sc.close();

    }

}
