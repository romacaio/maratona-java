package exercicios.date.questao11.model;

import exercicios.date.questao11.Exception.NivelTrabalhadorParseException;

import java.text.ParseException;

public enum NivelTrabalhador {
    JUNIOR(1, "Junior"),
    MID_LEVEL(2, "Mid Level"),
    SENIOR(3, "Senior");

    private final int valor;
    private final String nomeRelatorio;

    private NivelTrabalhador(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static NivelTrabalhador parse(String nivelString) {
        for (NivelTrabalhador nivel : NivelTrabalhador.values()) {
            if (nivel.getNomeRelatorio().equalsIgnoreCase(nivelString)) {
                return nivel;
            }
        }
        throw new NivelTrabalhadorParseException();
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
