package basic;

import java.util.Scanner;

public class Lesson_CompareInt {
    public static void main(String[] args) {
        //票价为10，判断并找零
        Scanner in = new Scanner(System.in);
        System.out.print("请投币: ");
        int amount = in.nextInt();
//        没有判断是否大于10
        System.out.println("购票成功！\n找零: " + (amount - 10));
//        in.close();
    }
}