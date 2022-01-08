package basic;

import java.util.Scanner;

public class Lesson_ForEach {
    public static void main(String[] args) {
        int[] num = {10,9,8,7,6,5,4,3,2,1};
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        boolean found = false;
        for( int k : num)       //for-each循环
        {                       //每次k取num[i]
            if( k == x)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Found!");
        else
            System.out.println("Not Found!");
    }
}
