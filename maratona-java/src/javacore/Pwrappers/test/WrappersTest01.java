package javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10;
        char charP = 'A';
        boolean booleanP = false;

        // boxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floaWt = 10F;
        Double doubleW = 10D;
        Character charW = 'A';
        Boolean booleanW = false;

        // unboxing
        int i = intW;


        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean("truE");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));

        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));


    }
}
