package javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    private String nomeRelatiorio;

    private TipoCliente(int VALOR, String nomeRelatiorio) {
        this.VALOR = VALOR;
        this.nomeRelatiorio = nomeRelatiorio;
    }

    public String getNomeRelatiorio() {
        return nomeRelatiorio;
    }

}
