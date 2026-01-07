package exercicios.logicaprogramacao.questao15.test;

import exercicios.logicaprogramacao.questao15.model.DiaExerc15;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        DiaExerc15 objetAno = new DiaExerc15(22, 2, 2025);

        Scanner input = new Scanner(System.in);
        System.out.println("Dia de nascimento: ");
        int diaNascimento = input.nextInt();
        System.out.println("Mês de nascimento: ");
        int mesNascimento = input.nextInt();
        System.out.println("Ano de nascimento: ");
        int anoNascimento = input.nextInt();

        int ano = objetAno.anoAtual - anoNascimento;
        int mes = objetAno.mesAtual - mesNascimento;
        int dia = objetAno.dataAtual - diaNascimento;

        if (mes < 0) {
            ano -= 1;
            mes += 12;
        }

        if (dia < 0) {
            mes -= 1;
            dia += 30;
        }

        System.out.println(ano + " anos, " + mes + " meses e " + dia + " dias de vida.");

    }
}
