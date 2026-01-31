package exercicios.date.questao12.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Fatura {
    private YearMonth competencia;
    private LocalDate inicio;
    private LocalDate diaFechamento;
    private LocalDate diaVencimento;

    public Fatura(YearMonth competencia) {
        this.competencia = competencia;
        calculaDatasFatura();
    }

    public void calculaDatasFatura() {
        inicio = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        diaFechamento = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).with(new DiaUtil());
        diaVencimento = diaFechamento.plusDays(10).with(new DiaUtil());
    }

    public Period periodoFatura() {
        LocalDate inicio = competencia.atDay(1);
        LocalDate fim = competencia.plusMonths(1).atDay(1);
        return Period.between(inicio, fim);
    }

    public void exibiFatura() {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMMM yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("FATURA - " + competencia.format(dtf1));
        System.out.println();
        System.out.println("Periódo: " + inicio.format(dtf2) + " a " + diaFechamento.format(dtf2));
        System.out.println("Duração da fatura: " + periodoFatura().getMonths() + " mês");
        System.out.println("Fechamento: " + diaFechamento.format(dtf2));
        System.out.println("Vencimento: " + diaVencimento.format(dtf2));

        System.out.println("Valor total: R$ 1.234,56");
    }

    public YearMonth getCompetencia() {
        return competencia;
    }

    public void setCompetencia(YearMonth competencia) {
        this.competencia = competencia;
    }

    public LocalDate getDiaFechamento() {
        return diaFechamento;
    }

    public void setDiaFechamento(LocalDate diaFechamento) {
        this.diaFechamento = diaFechamento;
    }

    public LocalDate getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(LocalDate diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

}
