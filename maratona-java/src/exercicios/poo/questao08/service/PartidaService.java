package exercicios.poo.questao08.service;

import exercicios.poo.questao08.model.Campeonato;
import exercicios.poo.questao08.model.Partida;
import exercicios.poo.questao08.model.Time;

public class PartidaService {

    public static int calculaNumPartidas(Campeonato campeonato) {
        int n = campeonato.getTimes().length;
        return n * (n - 1);
    }

    public void montarPartidas(Campeonato campeonato) {
        Time[] times = campeonato.getTimes();
        Partida[] partidas = new Partida[calculaNumPartidas(campeonato)];
        int partidaIndex = 0;

        for (int i = 0; i < times.length; i++) {
            for (int j = i + 1; j < times.length; j++) {
                partidas[partidaIndex] = new Partida(times[i], times[j]);
                ++partidaIndex;

                partidas[partidaIndex] = new Partida(times[j], times[i]);
                ++partidaIndex;
            }
        }
        campeonato.setPartidas(partidas);
    }


}
