package exercicios.date.questao08.test;
import exercicios.date.questao08.model.GerenciadorDeAssinaturas;

import java.time.*;

public class Aplicacao {
    public static void main(String[] args) {

        Instant instantNow = Instant.now();

        ZoneId zoneBrasil = ZoneId.of("America/Sao_Paulo");
        ZoneId zoneParis = ZoneId.of("Europe/Paris");
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        ZoneId zoneNovaYork = ZoneId.of("America/New_York");

        GerenciadorDeAssinaturas gerenciador = new GerenciadorDeAssinaturas(instantNow, zoneParis, 20.00);
        gerenciador.gerarRecibo();
    }
}
