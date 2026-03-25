package javacore.Zgenerics.test;

abstract class Aninal {
    public abstract void consulta();
}

class Cachorro extends Aninal {
    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
}

class Gato extends Aninal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

        Aninal[] animais = {new Cachorro(), new Gato()};
        printConsulta(animais);
    }

    private static void printConsulta(Aninal[] animais) {
        for (Aninal animal : animais) {
            animal.consulta();
        }
        //animais[1] = new Gato();
    }
}
