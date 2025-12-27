package exercicios.poo.questao08.view;

import exercicios.poo.questao08.model.Campeonato;
import exercicios.poo.questao08.model.Partida;
import exercicios.poo.questao08.model.Time;

import java.util.Scanner;

public class ConsoleView {

    public Campeonato incricaoTimes() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos times serão inscritos no campeonato? ");
        int numTimes = sc.nextInt();
        sc.nextLine();
        Time times[] = new Time[numTimes];

        for (int i = 0; i < numTimes; i++) {
            System.out.println("## Inscrição time " + (i + 1) + " ##");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            Time time = new Time(nome);
            times[i] = time;
        }
        return new Campeonato(times);
    }

    public void exibiPartidas(Campeonato campeonato) {
        Scanner sc = new Scanner(System.in);

        Partida[] partidas = campeonato.getPartidas();
        int count = 1;

        System.out.println();

        for (Partida partida : partidas) {
            Time casa = partida.getTimeCasa();
            Time visitante = partida.getTimeVisitante();

            System.out.println();
            System.out.println("## Partida " + count + " ##");

            System.out.println(casa.getNome() + " X " + visitante.getNome());
            System.out.print("Gols " + casa.getNome() + ": ");
            int golsCasa = sc.nextInt();

            System.out.print("Gols " + visitante.getNome() + ": ");
            int golsVisitante = sc.nextInt();

            count++;
            partida.setGolsCasa(golsCasa);
            partida.setGolsVisitante(golsVisitante);
        }
    }

    public void exibiClassificao(Campeonato campeonato) {
        Time[] times = campeonato.getTimes();

        System.out.println();

        System.out.println();
        System.out.println("=============== TABELA DO CAMPEONATO ===============");
        System.out.printf("%-3s %-15s %3s %3s %3s %3s %3s %3s %3s%n",
                "Pos", "Time", "Pts", "V", "E", "D", "GP", "GC", "SG");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < times.length; i++) {
            Time t = times[i];
            System.out.printf("%-3d %-15s %3d %3d %3d %3d %3d %3d %3d%n",
                    (i + 1),
                    t.getNome(),
                    t.getPontos(),
                    t.getVitorias(),
                    t.getEmpates(),
                    t.getDerrotas(),
                    t.getGolsPro(),
                    t.getGolsContra(),
                    t.getSaldoGols()
            );
        }
    }
}
