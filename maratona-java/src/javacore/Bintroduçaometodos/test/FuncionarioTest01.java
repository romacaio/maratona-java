package javacore.Bintroduçaometodos.test;

import javacore.Bintroduçaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        double[] salarios = {1200, 987.32, 2000};
        funcionario.nome = "Caio";
        funcionario.idade = 20;
        funcionario.salarios = salarios;

        funcionario.imprime();


    }
}
