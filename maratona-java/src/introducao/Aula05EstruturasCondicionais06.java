package introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        /*
            Utilizando Switch, dado os valores de 1 a 7, imprima se é dia útil ou final de semana
            Considerando 1 como domingo
         */

        byte dia = 6;
        switch (dia) {
            case 6:
            case 7:
                System.out.printf("Fim de semana");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        // outras formas
        System.out.println();
        switch (dia) {
            case 6, 7:
                System.out.println("Fim de semana");
                break;
            case 1, 2, 3, 4, 5:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        // não tem necessidade do break.
        switch (dia) {
            case 6, 7 -> System.out.println("Fim de semana");
            case 1, 2, 3, 4, 5 -> System.out.println("Dia útil");
            default -> System.out.println("Opção Inválida");

        }
    }
}
