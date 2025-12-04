package introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //byte, short, int, long, float, double = 0
        // char = ´/u0000´ (representa branco)
        // boolean = false

        int[] numeros = new int[3];
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        String[] nomes = new String[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        boolean[] respostas = new boolean[3];
        System.out.println(respostas[0]);
        System.out.println(respostas[1]);
        System.out.println(respostas[2]);

        char[] caracteres = new char[3];
        System.out.println(caracteres[0]);
        System.out.println(caracteres[1]);
        System.out.println(caracteres[2]);

    }
}


