package javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {

        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("dentro do multi catch");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do IndexOutOfBoundsException ");

        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}