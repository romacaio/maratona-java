package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salavar() {
        System.out.println("Salvando no banco de dados");
    }
}

