package javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    private final String nomeRelatiorio;

    private TipoCliente(int VALOR, String nomeRelatiorio) {
        this.VALOR = VALOR;
        this.nomeRelatiorio = nomeRelatiorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatiorio0) {
        for (TipoCliente tipo : values()) {
            if (tipo.nomeRelatiorio.equals(nomeRelatiorio0)) {
                return tipo;
            }
        }
        return null;
    }

    public String getNomeRelatiorio() {
        return nomeRelatiorio;
    }

}
