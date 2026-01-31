package exercicios.date.questao12.model;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        switch (dayOfWeek) {
            case DayOfWeek.SATURDAY -> temporal.plus(2, ChronoUnit.DAYS);
            case DayOfWeek.SUNDAY -> temporal.plus(1, ChronoUnit.DAYS);
        }

        return temporal;
    }
}
