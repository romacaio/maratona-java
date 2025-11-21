package introducao;

public class Aula06EstruturasDeRepeticoes02 {
    public static void main(String[] args) {
        // imprima todos os números pares até UM MILHÃO

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // pulando de dois em dois
        for (int i = 0; i <= 1000000; i += 2) {
            System.out.println(i);
        }
        
    }
}
