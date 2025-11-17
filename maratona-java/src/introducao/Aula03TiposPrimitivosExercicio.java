package introducao;

public class Aula03TiposPrimitivosExercicio {
    /*
        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagen:
        Eu, <nome>, morando no endereço <endereco>
        confirmo que recebi o salário de <salario>, na data <data>
     */
    public static void main(String[] args){
        String nome = "Caio";
        String endereco = "Rua Jorge Bernado da Silva";
        double sarario = 4300.00;
        String data = "17/11/2025";

        System.out.println("Eu, " + nome + ", morando no endereço " + endereco +
                "\nconfirmo que recebi o salário de R$" + sarario + ", na data " + data);

    }
}
