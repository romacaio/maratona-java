package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +  -  *  /
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 + num2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num2 / num1);
        System.out.println(num1 * num2);

        System.out.println();
        System.out.println(resultado);
        System.out.println("Valor: " + num1 + num2); // vai interpretar o + da adição como contenação
        System.out.println("Valor: " + (num1 + num2));

        // % (resto divisão)
        int resto = 20 % 2;
        System.out.println();
        System.out.println(resto);

        // < >  <=  >= == !=

        boolean isDezMaiorQue20 = 10 > 20;
        boolean isDezMenorQue20 = 10 < 20;
        boolean isDezIgualQue20 = 10 == 20;
        boolean isDezIgualQue10 = 10 == 10;
        boolean isDezDiferenteQue10 = 10 != 10;

        System.out.println();
        System.out.println("isDezMaiorQue20 " + isDezMaiorQue20);
        System.out.println("isDezMenorQue20 " + isDezMenorQue20);
        System.out.println("isDezIgualQue20 " + isDezIgualQue20);
        System.out.println("isDezIgualQue10 " + isDezIgualQue10);
        System.out.println("isDezDiferenteQue10 " + isDezDiferenteQue10);

        // && (and) || (or) ! (Negação)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
    }
}
