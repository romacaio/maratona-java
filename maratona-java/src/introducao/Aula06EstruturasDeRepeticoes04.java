package introducao;

public class Aula06EstruturasDeRepeticoes04 {
    /*
        Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        Condição valorParcela >= 1000
    */
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for " + parcela);
        }

        // de outra forma mais limpa
        for (int parcela2 = 1; parcela2 <= valorTotal; parcela2++) {
            double valorParcela2 = valorTotal / parcela2;
            if (valorParcela2 < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela2 + " R$ " + valorParcela2);
        }

    }
}