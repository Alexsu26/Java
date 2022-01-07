package basic;

import java.util.Scanner;

public class Lesson_Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch ( type )
        {
            case 1:
            case 2:
                System.out.println("你好");
                break;
            case 3:
                System.out.println("早上好！");
            case 4:
                System.out.println("中午好！");
                break;
            default:
                System.out.println("我不明白!");
        }
    }
}
