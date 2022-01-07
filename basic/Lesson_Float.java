package basic;

import java.util.Scanner;

public class Lesson_Float {
    public static void main(String[] args) {
        //浮点数运算，以身高转化为例
        //公制 = （英尺 + 英寸/12）* 0.3048
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println((int)((foot+inch/12) * 0.3048 * 100));

        in.close();

        //精度问题1.2-1.1
        System.out.println(1.2-1.1);

        //类型转换,前面加（Elemtype）,只改变紧跟在后面的
        //那个元素的类型
        int x = 10;
        double y = 3.0;
        System.out.println((int)x/y);   //输出3.3333333333
        System.out.println((int)(x/y)); //输出3

    }
}
