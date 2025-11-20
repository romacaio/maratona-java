package introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // ou if(idade >= 18)
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado");
        }
        System.out.println("Fora do if ");
    }
}
