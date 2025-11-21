package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se o salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //(condição) ? true : false
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
