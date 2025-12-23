package exercicios.poo.questao01.Test;

import exercicios.poo.questao01.model.AssistenteAdministrativo;
import exercicios.poo.questao01.model.AssistenteTecnico;
import exercicios.poo.questao01.model.Turno;

public class Aplicacao {
    public static void main(String[] args) {
        AssistenteAdministrativo assistente1 = new AssistenteAdministrativo("Caio César", 2500,
                "202415020017", Turno.NOITE);

        AssistenteTecnico assistente2 = new AssistenteTecnico("José Eduardo", 1500,
                "202115520009", 300);

        assistente1.exibirDados(assistente1);
        System.out.println("\n--------------------------------");
        assistente2.exibirDados(assistente2);
    }
}
