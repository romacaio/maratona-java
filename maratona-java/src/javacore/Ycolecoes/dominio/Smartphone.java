package javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /* Regras pra uma boa sobrescrita do método equals

    reflexivo: um objeto deve ser igual a ele mesmo, x.equals(x) == true, menos se for null.
    simétrico: para x e y diferentes de null, se y.equals(x) == true, logo x.equals(y) == true tbm.
    transitividade: para x, y e z diferentes de null, se x.equals(u) == true e y.equals(z) == true, logo z.equals(x) == true.
    consistente: Caso x.equals(y) == true, sempre tem que retorna true se x for diferente de null.
    comparação com null: sempre deve retornar false.

     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smartphone.getSerialNumber());

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}