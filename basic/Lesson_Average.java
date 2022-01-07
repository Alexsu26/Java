package basic;

import java.util.Scanner;

public class Lesson_Average {
    public static void main(String[] args) {
        //计算平均数
        Scanner in = new Scanner(System.in);
        int sum = 0, number, count = 0;
//        number = in.nextInt();
//        while( number != -1 )
//        {
//            sum += number;
//            ++count;
//            number = in.nextInt();
//        }
        do {
            number = in.nextInt();
            if( number != -1 ) {
                sum += number;
                count++;
            }
        }while( number != -1);
        double average = (double)sum/count;
        System.out.println("平均值为： " + average);
    }
}
