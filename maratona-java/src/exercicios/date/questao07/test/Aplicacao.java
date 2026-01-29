package exercicios.date.questao07.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Aplicacao {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        ZoneOffset offSet = ZoneOffset.of("-03:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSet);

        Instant instant = offsetDateTime.toInstant();
        System.out.println(instant);


    }
}
