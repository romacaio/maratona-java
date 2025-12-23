package exercicios.poo.questao01.model;

public enum Turno {
    DIA(0) {
        @Override
        public void CalcularAdicionalNoturno(Assistente assistente) {

        }

    },

    NOITE(50) {
        @Override
        public void CalcularAdicionalNoturno(Assistente assistente) {
            if (!(assistente instanceof AssistenteAdministrativo)) {
                return;
            }
            assistente.addAumento(getAdicionalNoturno());
        }
    };

    private double adicionalNoturno;

    Turno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public abstract void CalcularAdicionalNoturno(Assistente assistente);

    public double getAdicionalNoturno() {
        return this.adicionalNoturno;
    }

    public void setAdicionalNoturno(Double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
}

