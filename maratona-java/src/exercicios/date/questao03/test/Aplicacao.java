package exercicios.date.questao03.test;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime fimEspediente = LocalTime.of(18, 0);
        LocalTime inputDate;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        while (true) {
            System.out.print("Digite um horário (HH:mm): ");
            String input = sc.nextLine();

            try {
                inputDate = LocalTime.parse(input, formatter);

            } catch (DateTimeException e) {
                System.out.println("Digite um horário válido no padrão estabelecido.\n");
                continue;
            }
            break;
        }

        System.out.println(inputDate.isAfter(fimEspediente) ? "O horário é depois do expediente" :
                "O horário é antes do expediente");
    }

}
