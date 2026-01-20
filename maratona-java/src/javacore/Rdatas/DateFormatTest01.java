package javacore.Rdatas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        DateFormat[] dt = new DateFormat[7];

        dt[0] = DateFormat.getInstance();
        dt[1] = DateFormat.getDateInstance();
        dt[2] = DateFormat.getDateTimeInstance();

        dt[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dt[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dt[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dt[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : dt){
            System.out.println(dateFormat.format(cal.getTime()));
        }

    }
}
