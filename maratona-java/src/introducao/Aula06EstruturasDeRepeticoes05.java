package introducao;

public class Aula06EstruturasDeRepeticoes05 {
    /*
        Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        Condição valorParcela >= 1000
    */

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
               // não vá para próxima linha enquanto parcela > 1000
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}