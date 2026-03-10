package exercicios.poo.questao10.test;

import exercicios.poo.questao10.model.Produto;
import exercicios.poo.questao10.model.ProdutoImportado;
import exercicios.poo.questao10.model.ProdutoUsado;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de produtos que serão lidos: ");
        int num = sc.nextInt();


        Produto[] produtos = new Produto[num];

        for (int i = 0; i < num; i++) {
            System.out.println("produto #" + (i + 1) + " dados");

            System.out.print("Comum, usado ou Importado (c/u/i): ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            if (tipo == 'i') {
                System.out.print("Taxa Alfândega: ");
                double taxa = sc.nextDouble();
                sc.nextLine();
                produtos[i] = new ProdutoImportado(nome, preco, taxa);

            } else if (tipo == 'u') {
                System.out.print("Data fabricação: ");
                String dataInput = sc.nextLine();
                LocalDate dataFabricacao = LocalDate.parse(dataInput, ProdutoUsado.dtf);
                produtos[i] = new ProdutoUsado(nome, preco, dataFabricacao);

            } else {
                produtos[i] = new Produto(nome, preco);
            }

        }

        System.out.println("\nEtiquetas de preço: ");
        for (Produto p : produtos) {
            p.etiquetaPreco();
        }

    }
}
