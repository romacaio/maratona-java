package javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do Arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no Arquivo...");
    }
}
