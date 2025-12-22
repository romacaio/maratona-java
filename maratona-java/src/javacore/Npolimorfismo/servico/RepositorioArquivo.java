package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salavar() {
        System.out.println("Salvando em um arquivo");
    }
}
