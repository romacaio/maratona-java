package exercicios.date.questao08.model;

import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class GerenciadorDeAssinaturas {
    private ZonedDateTime dataAssinatura;
    private double valorBase;

    public GerenciadorDeAssinaturas(Instant instantAssinatura, ZoneId zone, double valorBase) {
        this.dataAssinatura = ZonedDateTime.ofInstant(instantAssinatura, zone);
        this.valorBase = valorBase;
    }

    public LocalDate dataPagamento() {
        LocalDate dataPagamento = dataAssinatura.plusDays(7).toLocalDate();
        LocalTime time = LocalTime.of(18, 0);

        if (dataAssinatura.getDayOfWeek() == DayOfWeek.FRIDAY && dataAssinatura.getHour() > time.getHour()) {
            dataPagamento = dataPagamento.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        return dataPagamento;
    }

    private Locale getLocaleFromZoneId() {
        String zone = dataAssinatura.getZone().toString();
        Locale localeZone;

        switch (zone) {
            case "America/Sao_Paulo" -> localeZone = new Locale("pt", "BR");
            case "Europe/Paris" -> localeZone = Locale.FRANCE;
            case "Asia/Tokyo" -> localeZone = Locale.JAPAN;
            case "America/New_York" -> localeZone = Locale.US;
            default -> localeZone = Locale.getDefault();
        }
        return localeZone;
    }

    public void gerarRecibo() {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat nf = NumberFormat.getCurrencyInstance(getLocaleFromZoneId());

        System.out.println("## RECIBO ##");
        System.out.println("Data Assinatura: " + this.dataAssinatura.toLocalDateTime().format(dtf1));
        System.out.println("Data Primeiro pagamento: " + dataPagamento().format(dtf2));
        System.out.printf("Valor da assinatura: %s", nf.format(valorBase));
    }

    public ZonedDateTime getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(ZonedDateTime dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
