package introducao;

public class Aula06EstruturasDeRepeticoes03 {
    // Imprima os primeiros vinte e cinco números de uma dado valor. Por exemplo, 50
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

    }
}
