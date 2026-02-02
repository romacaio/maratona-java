package javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {

        Date date = new Date(1768865006595L); // long
        System.out.println(date.getTime());
        date.setTime(date.getTime() + 3_600_000); // adiciona 1 hora
        System.out.println(date);
    }
}
