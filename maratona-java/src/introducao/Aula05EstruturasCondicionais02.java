package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
            idade < 15 = categoria infantil
            idade >= 15 && idade < 18 = juvenil
            idade >= 18 = categoria adulta

         */

        int idade = 8;
        String categoria; // apenas declarada, não inicializada.
        if (idade < 15) {
            categoria = "Categoria Infantil";
            System.out.println(categoria);
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
            System.out.println(categoria);
        } else {
            categoria = "Categoria Adulta";
            System.out.println(categoria);
        }
    }
}
