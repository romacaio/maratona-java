package exercicios.date.questao10.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime now = LocalDateTime.now().withHour(9);
        int hora = now.getHour();

        System.out.println("Qual o seu nome: ");
        String nomeUser = sc.nextLine();

        if (hora >= 0 && hora <= 11) {
            System.out.printf("%s %s", "Bom Dia,", nomeUser);
        } else if (hora >= 12 && hora <= 17) {
            System.out.printf("%s %s", "Bom Tarde,", nomeUser);
        } else {
            System.out.printf("%s %s", "Bom Noite,", nomeUser);
        }
    }
}
