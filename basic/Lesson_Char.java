package basic;

import java.util.Scanner;

public class Lesson_Char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = 65;
        c++;
        System.out.println(c);

        char a = 'A';
        a++;
        System.out.println("a = " + a +
                ";\n (int)a = " + (int) a);

        char b = '\u0041';
        System.out.println(b);
        System.out.println('Z' - 'A');

        System.out.println("abc\bd");
    }
}
