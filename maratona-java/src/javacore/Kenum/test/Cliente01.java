package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;

public class Cliente01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Kuririn", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Gohan", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
