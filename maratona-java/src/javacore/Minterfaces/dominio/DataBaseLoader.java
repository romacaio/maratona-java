package javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {


    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de Dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no Banco de Dados...");
    }
}
