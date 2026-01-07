package exercicios.logicaprogramacao.questao19.test;

public class Aplicacao {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n## TABUADA DO " + i + " ##");
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
        }
    }
}
