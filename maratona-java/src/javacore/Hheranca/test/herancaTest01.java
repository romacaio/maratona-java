package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class herancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("58500-000");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("083.234.674-20");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------------");

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("154.728.404-28");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2400.00);
        funcionario.imprime();

    }
}
