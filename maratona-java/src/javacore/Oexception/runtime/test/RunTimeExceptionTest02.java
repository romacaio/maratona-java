package javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */

    private static int divisao(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Argumento invalido, não pode ser 0");
        }
        return a / b;
    }
}
