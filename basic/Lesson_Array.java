package basic;

import java.util.Scanner;

public class Lesson_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, cnt = 0;
        double sum = 0.0;
        int[] numbers = new int[100];   //创建数组
        x = in.nextInt();
        while( x != -1)
        {
            numbers[cnt++] = x;
            sum += x;
            x = in.nextInt();
        }
        if( cnt>0 )
        {
            double average = sum/cnt;
            for( int i=0; i<cnt; i++)
                if(numbers[i] > average)
                    System.out.print(numbers[i] + " ");
            System.out.println("\n" + average);
        }
        System.out.println(numbers.length);
    }
}
