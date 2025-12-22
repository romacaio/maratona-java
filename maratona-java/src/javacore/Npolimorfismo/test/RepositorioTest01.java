package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioArquivo;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salavar();
        repositorio = new RepositorioArquivo();
        repositorio.salavar();
        repositorio = new RepositorioMemoria();
        repositorio.salavar();
    }
}
