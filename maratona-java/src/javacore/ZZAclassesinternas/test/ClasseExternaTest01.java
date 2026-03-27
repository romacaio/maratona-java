package javacore.ZZAclassesinternas.test;

public class ClasseExternaTest01 {
    private String nome = "Monkey D. Luffy";

    class Interna {
        public void printAtributosClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClasseExternaTest01.this);

            /*
            O this sempre se refere ao contexto da classe que se enconta, nesse caso (interna)
            Para referênciar a classe externa dentro da interna usamos dessa forma: ClasseExternaTest01.this
             */
        }
    }

    public static void main(String[] args) {
        ClasseExternaTest01 classeExterna = new ClasseExternaTest01();
        Interna interna = classeExterna.new Interna();
        Interna interna2 = new ClasseExternaTest01().new Interna();

        interna.printAtributosClasseExterna();
        System.out.println();
        interna2.printAtributosClasseExterna();
    }
}
