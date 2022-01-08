package basic;

import java.util.Scanner;

public class Lesson_ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int n = in.nextInt();
        int factor = 1;
        for (i = 1; i <= n; ++i)
            factor *= i;
        System.out.println(factor);
    }
}
