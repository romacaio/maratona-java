package exercicios.poo.questao03.test;

import exercicios.poo.questao03.model.DiaSemana;

public class Aplicacao {
    public static void main(String[] args) {
        DiaSemana[] diasSemana = DiaSemana.values();

        for (DiaSemana dia : diasSemana) {
            if (!dia.isFimDeSemana()) continue;
            System.out.println(dia);
        }

    }
}
