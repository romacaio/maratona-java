package exercicios.poo.questao08.test;

import exercicios.poo.questao08.model.Campeonato;
import exercicios.poo.questao08.service.CampeonatoService;
import exercicios.poo.questao08.service.PartidaService;
import exercicios.poo.questao08.view.ConsoleView;

public class Aplicacao {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        Campeonato campeonato = consoleView.incricaoTimes();

        PartidaService partidaService = new PartidaService();
        partidaService.montarPartidas(campeonato);

        consoleView.exibiPartidas(campeonato);

        CampeonatoService campeonatoService = new CampeonatoService();
        campeonatoService.prcessarResultado(campeonato);
        campeonatoService.classificar(campeonato);

        consoleView.exibiClassificao(campeonato);


    }
}
