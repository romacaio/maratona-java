package exercicios.exceptions.questao08.test;

import java.sql.SQLException;

public class Aplicacao {
    public static void main(String[] args) {
        try {
            acessarSistema();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

    public static void conectarBanco() throws SQLException {
        throw new SQLException();
    }

    public static void acessarSistema() {
        try {
            conectarBanco();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao acessar o sistema", e);
        }
    }

}
