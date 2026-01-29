package exercicios.date.questao09.test;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Aplicacao {
    public static void main(String[] args) {

        ZoneOffset zoneOffset = ZoneOffset.of("-03:00");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneOffset);
        System.out.println("Com Offset: " + zonedDateTime);

        Instant instant = zonedDateTime.toInstant();
        System.out.println("Em UTC (Instant): " + instant);
    }
}
