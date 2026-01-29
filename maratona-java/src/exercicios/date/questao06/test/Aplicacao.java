package exercicios.date.questao06.test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Aplicacao {
    public static void main(String[] args) {

        Instant instantNow = Instant.now();

        ZoneId zoneLondres = ZoneId.of("Europe/London");
        ZoneId zoneCalifornia = ZoneId.of("America/Los_Angeles");

        ZonedDateTime zonedDateTime1 = instantNow.atZone(zoneLondres);
        ZonedDateTime zonedDateTime2 = instantNow.atZone(zoneCalifornia);

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);


    }
}
