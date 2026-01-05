package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        double[] salarios = {1200, 987.32, 2000};
        funcionario.setNome("Caio");
        funcionario.setIdade(20);
        funcionario.setSalarios(salarios);

        funcionario.imprime();


    }
}
