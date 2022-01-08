package basic;

public class Lesson_TwoDimArray {
    public static void main(String[] args) {
        int[][] a = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                a[i][j] = i * j;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        int[][] b = {{1, 2, 3, 4}, {1, 2},};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
