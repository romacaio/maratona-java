package exercicios.poo.questao08.service;

import exercicios.poo.questao08.model.Campeonato;
import exercicios.poo.questao08.model.Partida;
import exercicios.poo.questao08.model.Time;

public class CampeonatoService {

    public void prcessarResultado(Campeonato campeonato) {
        Partida[] partidas = campeonato.getPartidas();

        for (int i = 0; i < partidas.length; i++) {
            Time timeCasa = partidas[i].getTimeCasa();
            Time timeVisitante = partidas[i].getTimeVisitante();

            atualizarGols(timeCasa, partidas[i].getGolsCasa(), partidas[i].getGolsVisitante());
            atualizarGols(timeVisitante, partidas[i].getGolsVisitante(), partidas[i].getGolsCasa());

            if (partidas[i].getGolsCasa() > partidas[i].getGolsVisitante()) {
                registrarVitoria(timeCasa);
                registrarDerrota(timeVisitante);


            } else if (partidas[i].getGolsCasa() == partidas[i].getGolsVisitante()) {
                registrarEmpate(timeCasa);
                registrarEmpate(timeVisitante);


            } else {
                registrarDerrota(timeCasa);
                registrarVitoria(timeVisitante);

            }
        }
        calculaSaldo(campeonato);
    }

    public static void registrarVitoria(Time vencedor) {
        vencedor.setVitorias(vencedor.getVitorias() + 1);
        vencedor.setPontos(vencedor.getPontos() + 3);
    }

    public static void registrarDerrota(Time derrotado) {
        derrotado.setDerrotas(derrotado.getDerrotas() + 1);
    }

    public static void registrarEmpate(Time time) {
        time.setEmpates(time.getEmpates() + 1);
        time.setPontos(time.getPontos() + 1);
    }

    public static void atualizarGols(Time time, int golsPro, int golsContra) {
        time.setGolsPro(time.getGolsPro() + golsPro);
        time.setGolsContra(time.getGolsContra() + golsContra);

    }

    public static void calculaSaldo(Campeonato campeonato) {
        Time[] times = campeonato.getTimes();
        for (Time time : times) {
            time.setSaldoGols(time.getGolsPro() - time.getGolsContra());
        }
    }

    public void classificar(Campeonato campeonato) {
        Time[] times = campeonato.getTimes();

        for (int i = 0; i < times.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < times.length - 1 - i; j++) {
                if (times[j].getPontos() < times[j + 1].getPontos()) {
                    Time temp = times[j + 1];
                    times[j + 1] = times[j];
                    times[j] = temp;

                    trocou = true;
                } else if (times[j].getPontos() == times[j + 1].getPontos()) {
                    if (times[j].getSaldoGols() < times[j + 1].getSaldoGols()) {
                        Time temp = times[j + 1];
                        times[j + 1] = times[j];
                        times[j] = temp;

                        trocou = true;
                    }

                }
            }
            if (!trocou) {
                break;
            }
        }
    }
}
