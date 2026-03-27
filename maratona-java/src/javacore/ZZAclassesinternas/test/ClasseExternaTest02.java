package javacore.ZZAclassesinternas.test;

public class ClasseExternaTest02 {
    private String nome = "Midoriya";

    public void print(String parametro) {
        String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {
                System.out.println(parametro);
                System.out.println(nome + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        ClasseExternaTest02 classeExterna = new ClasseExternaTest02();
        classeExterna.print("Parâmetro");
    }
}
