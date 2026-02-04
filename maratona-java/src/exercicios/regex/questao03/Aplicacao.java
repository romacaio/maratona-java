package exercicios.regex.questao03;

public class Aplicacao {
    public static void main(String[] args) {

        String texto = "Pagamento aprovado para o cartão 1234-5678-9012-3456.";
        String regex = "(\\d{4}-){3}";

        String resultado = texto.replaceAll(regex, "XXXX-XXXX-XXXX-");
        System.out.println(resultado);
    }
}
