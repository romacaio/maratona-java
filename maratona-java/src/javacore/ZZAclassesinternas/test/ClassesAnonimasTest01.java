package javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal andando");
    }
}

public class ClassesAnonimasTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Caminhando nas sombras");
            }
        };
        animal.walk();
    }
}
