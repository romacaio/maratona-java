package introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - * /
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
    }
}
