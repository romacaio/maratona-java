package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();

        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();

        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();

        if (!usernameDigitado.equals(usernameDB) || !senhaDigitada.equals(senhaDB)) {
            throw new LoginInvalidoException("Usuário ou Senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");

    }
}
