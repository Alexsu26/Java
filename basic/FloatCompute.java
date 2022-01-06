package basic;

import java.util.Scanner;

public class FloatCompute {
    public static void main(String[] args) {
        //浮点数运算，以身高转化为例
        //公制 = （英尺 + 英寸/12）* 0.3048
        int foot;
        int inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextInt();
        System.out.println((foot+inch/12.0) * 0.3048);

        in.close();
    }
}
