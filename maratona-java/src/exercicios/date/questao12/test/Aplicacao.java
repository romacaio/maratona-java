package exercicios.date.questao12.test;

import exercicios.date.questao12.model.Fatura;

import java.time.Month;
import java.time.YearMonth;

public class Aplicacao {
    public static void main(String[] args) {

        Fatura fatura = new Fatura(YearMonth.of(2026, Month.JANUARY));
        fatura.exibiFatura();

    }
}
