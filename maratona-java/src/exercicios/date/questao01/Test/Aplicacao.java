package exercicios.date.questao01.Test;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Aplicacao {
    public static void main(String[] args) {

        // Um voo sai de São Paulo (America/Sao_Paulo) no dia 20/08/2025 às 10:00 da manhã.

        ZoneId zoneSP = ZoneId.of("America/Sao_Paulo");
        Locale localeBR = Locale.of("pt", "BR");

        LocalDateTime saidaLocal = LocalDateTime.of(2025, 8, 20, 10, 0);
        ZonedDateTime saida = ZonedDateTime.of(saidaLocal, zoneSP);

        // O voo tem duração de 12 horas, o destino é Tóquio (Asia/Tokyo).

        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime chegada = saida.plusHours(12).withZoneSameInstant(zoneTokyo);

        DateTimeFormatter formatterBR = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withLocale(localeBR);
        DateTimeFormatter formatterJP = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withLocale(Locale.JAPAN);

        System.out.println("Saída São Paulo: " + saida.format(formatterBR));
        System.out.println("Chegada Tokyo: " + chegada.format(formatterJP));



    }
}
