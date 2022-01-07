package basic;

import java.util.Scanner;

public class Lesson_Judge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请投币: ");
        int amount = in.nextInt();

        if ( amount >= 10)
            System.out.println("购票成功！\n找零: " + (amount - 10));
    }
}
