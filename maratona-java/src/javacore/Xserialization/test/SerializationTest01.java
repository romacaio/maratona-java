package javacore.Xserialization.test;

import javacore.Xserialization.dominio.Aluno;
import javacore.Xserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Caio César", "1234");
        Turma turma = new Turma("Maratona Java Virado no Jiraya");
        aluno.setTurma(turma);

        serializar(aluno);
        deserializar();
        // deserialização não utilizar o constutor
    }

    private static void serializar(Aluno aluno) {
        Path path = Path.of("pasta/aluno.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))) {
            oss.writeObject(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Path.of("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
