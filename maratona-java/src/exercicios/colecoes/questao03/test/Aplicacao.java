package exercicios.colecoes.questao03.test;

import exercicios.colecoes.questao03.model.Estoque;
import exercicios.colecoes.questao03.model.Produto;

public class Aplicacao {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Produto("Arroz", 10));
        estoque.adicionarProduto(new Produto("Café", 15));
        estoque.adicionarProduto(new Produto("Coca-Cola", 0));
        estoque.adicionarProduto(new Produto("Fósforo", 50));
        estoque.adicionarProduto(new Produto("Iourgute", 12));
        estoque.adicionarProduto(new Produto("Macarrão", 0));

        estoque.listarPorNome();
    }
}
