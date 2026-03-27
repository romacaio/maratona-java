package javacore.ZZAclassesinternas.test;

public class ClasseExternaTest03 {
    private String nome = "William";

    static class Alinhada {
        private String lastName = "Suane";

        public void print() {
            System.out.println(new ClasseExternaTest03().nome + " " + lastName);
        }
    }

    public static void main(String[] args) {

        //ClasseExternaTest03.Alinhada alinhada = new Alinhada();
        Alinhada alinhada = new Alinhada();
        alinhada.print();
    }
}
