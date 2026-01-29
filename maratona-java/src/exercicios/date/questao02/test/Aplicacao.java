package exercicios.date.questao02.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aplicacao {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(2005, 12, 14);
        CalculadoraIdade(dataNascimento);
    }

    public static void CalculadoraIdade(LocalDate dataNascimento) {
        LocalDate now = LocalDate.now();
        long anos = dataNascimento.until(now, ChronoUnit.YEARS);
        long dias = dataNascimento.until(now, ChronoUnit.DAYS);

        System.out.println("Sua idade exata em anos: " + anos);
        System.out.println("Sua quantidade de dias vividos: " + dias);
    }
}
