package exercicios.date.questao04.test;

import java.time.LocalDateTime;
import java.time.Month;

public class Aplicacao {
    public static void main(String[] args) {

        LocalDateTime consulta = LocalDateTime.of(2025, Month.OCTOBER, 25,14,30);
        LocalDateTime consultaAtraso = consulta.plusHours(1).plusMinutes(15);

        System.out.println("Horário original previsto da consulta: " + consulta);
        System.out.println("Horário previsto depois do atraso: " + consultaAtraso);
    }
}
