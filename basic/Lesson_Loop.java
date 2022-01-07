package basic;

import java.util.Scanner;

public class Lesson_Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 0;
        while (true)
        {
            System.out.print("请投币： ");
            int amount = in.nextInt();
            balance += amount;
            if( balance >= 10 )
            {
                System.out.println("找零： " + (balance - 10 ));
                balance = 0;
            }
        }
    }

}
