package exercicios.poo.questao14.model;

import java.time.LocalDateTime;

public class LocacaoVeiculo {
    private Veiculo veiculo;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Fatura fatura;

    public LocacaoVeiculo() {

    }

    public LocacaoVeiculo(Veiculo veiculo, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
