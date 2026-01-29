package exercicios.date.questao05.test;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate inputDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("Digite a data da assinatura do contrato (dd/MM/yyyy): ");
            String input = sc.nextLine();
            try {
                inputDate = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Digite uma data com o padrão solicitado\n");
                continue;
            }
            break;
        }

        LocalDate dateFaturamento = inputDate.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate ultimoDiaCorrente = inputDate.with(TemporalAdjusters.lastDayOfYear());
        LocalDate dateReuniao = inputDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println();
        System.out.println("Data faturamento: " + dateFaturamento);
        System.out.println("Último dia corrente: " + ultimoDiaCorrente);
        System.out.println("Data reunião: " + dateReuniao);

    }
}
