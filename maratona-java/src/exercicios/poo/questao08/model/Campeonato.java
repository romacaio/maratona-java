package exercicios.poo.questao08.model;

public class Campeonato {
    Time[] times;
    Partida[] partidas;

    public Campeonato(Time[] times) {
        this.times = times;
    }

    public Time[] getTimes() {
        return times;
    }

    public void setTimes(Time[] times) {
        this.times = times;
    }

    public Partida[] getPartidas() {
        return partidas;
    }

    public void setPartidas(Partida[] partidas) {
        this.partidas = partidas;
    }
}
