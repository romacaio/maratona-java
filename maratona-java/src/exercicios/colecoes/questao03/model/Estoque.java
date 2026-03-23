package exercicios.colecoes.questao03.model;

import java.util.*;

public class Estoque {
    private Map<Integer, Produto> estoqueMap = new HashMap<>();

    public Estoque() {

    }

    public void adicionarProduto(Produto produto) {
        estoqueMap.put(produto.getId(), produto);
    }

    public void listarPorNome() {
        List<Produto> listProdutos = new ArrayList<>(estoqueMap.values());
        listProdutos.removeIf(Produto -> Produto.getQuantidade() == 0);

        Collections.sort(listProdutos);
        for (Produto produto : listProdutos) {
            System.out.println(produto.getNome());
        }
    }

    public Produto buscarPorId(Integer id) {
        return estoqueMap.get(id);
    }
}
