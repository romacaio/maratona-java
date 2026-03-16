package exercicios.poo.questao14.service;

public class ImpostoBrasil implements ImpostoService {

    public ImpostoBrasil() {

    }

    @Override
    public double imposto(double valor) {
        if (valor <= 100.00) return valor * 0.20;
        return valor * 0.15;
    }
}

