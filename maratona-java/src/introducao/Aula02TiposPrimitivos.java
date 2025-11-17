package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, long, boolean

        byte idadeByte = (byte) 1000;
        short idadeShort = (short) 100000; //casting explícito
        int idade = 10;
        long numeroGrande = idade; //casting implícito
        float salarioFloat = 2500.32F;
        double salarioDouble = 2000;
        char caracter = 'A';
        boolean isVerdade = true;
        boolean isFalso = false;
        String nome = "Goku";
        var nome2 = "caio";
        System.out.println("a idade é " + numeroGrande + " anos.");
        System.out.println(isVerdade);
        System.out.println(isFalso);
        System.out.println(caracter);
        System.out.println("oi, meu nome é " + nome);
        System.out.println("oi, meu nome é " + nome2);
    }
}
