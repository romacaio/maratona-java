package javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /* Regras pra uma boa sobrescrita do equals

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

    /* Regras para sobrescrita do hashCode

    se x.equals(y) == true, então x.hashCode() == y.hashCode().
    se x.hashCode() == y.hashCode, não necessariamente x.equals(y) tem que ser true.
    se x.hashCode() != y.hashCode, x.equals(y) deverá ser false.
     */

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
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

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}