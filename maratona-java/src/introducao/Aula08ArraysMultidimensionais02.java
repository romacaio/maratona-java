package introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // formas de inicializar um array multidimensional

        int[] array = {0, 0};

        int[][] arrayInt = new int[3][];
        arrayInt[0] = array;
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = new int[][]{{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
