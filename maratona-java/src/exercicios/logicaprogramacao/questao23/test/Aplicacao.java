package exercicios.logicaprogramacao.questao23.test;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da hora aula: $");
        double valorHoraAula = sc.nextDouble();

        System.out.println("Entre com o números de aulas lecionadas no mês: ");
        int numAulas = sc.nextInt();

        System.out.println("Entre com o percentual de desconto do INSS: ");
        double descontoINSS = sc.nextDouble();

        double salarioLiquido = valorHoraAula * numAulas;
        double desconto = salarioLiquido * (descontoINSS / 100);

        salarioLiquido -= desconto;

        System.out.printf("Salário líquido final: $%.2f", salarioLiquido);

        sc.close();
    }
}
