package basic;

import java.util.Scanner;

public class Lesson_RandNumber {
    public static void main(String[] args) {
        //随机生成一个数，用户来猜,最后输出次数
        Scanner in = new Scanner(System.in);
        int number = (int) (Math.random() * 100 + 1);   //[0,1) -->[0,100) --> [1,100]
        int x;
        int count = 0;

        do {
            x = in.nextInt();
            if (x < number) {
                System.out.println("小了");
            } else if (x > number) {
                System.out.println("大了");
            }
            ++count;
        } while (x != number);
        System.out.println("恭喜你猜对了！你猜了" + count + "次");
    }
}
