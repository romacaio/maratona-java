package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salavar() {
        System.out.println("Salvando na memória");
    }
}

