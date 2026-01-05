package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] ags) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ford Maverick";
        carro1.modelo = "Ford Maverick GT";
        carro1.ano = 1974;

        carro2.nome = "Gol";
        carro2.modelo = "Gol BX";
        carro2.ano = 1980;

        carro1 = carro2;

        System.out.println("Carro 1 " + "\nNome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println();
        System.out.println("Carro 2 " + "\nNome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
