package exercicios.exceptions.questao07.test;

public class Aplicacao {
    public static void main(String[] args) {
        try {
            validarIdade(20);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarIdade(int idade) {
        if (idade > 0 && idade < 18) {
            throw new IllegalArgumentException("Menor de idade");
        } else {
            System.out.println("Maior de idade.");
        }
    }
}
