package exercicios.logicaprogramacao.questao18.test;

public class Aplicacao {
    public static void main(String[] args) {

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int countAnos = 0;

        for (int i = 1; alturaSara < alturaFrancisco; i++) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;

            if (alturaSara >= alturaFrancisco) {
                countAnos = i;
            }
        }

        System.out.println("Serão necessários para que Sara seja maior que Francisco: " + countAnos + " anos.");
    }
}
