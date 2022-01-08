package basic;

import java.util.Locale;
import java.util.Scanner;

public class Lesson_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "a string";
        String b = "another one";
        System.out.println(s +" " +  b + 12);   //自动将12变为字符

        String str1, str2;
        //nextLine读入一行，以换行为止
        str1 = in.nextLine();
        System.out.println(str1);

        //next包括空格
        str2 = in.next();
        System.out.println(str2);

        //compareTo比较字符串
        String str3 = "test";
        System.out.println("test1".compareTo(str3));

        System.out.println(str1 == str2);   //判断两个是否是同一个
        System.out.println(str1.equals(str2));  //比较内容是否相等

        //String类也可按下标访问，从0开始
        System.out.println(str3.charAt(2));

        //substring
        String str4 = "0123456";
        System.out.println(str4.substring(2));  //从第2位到最后
        System.out.println(str4.substring(2,5));   //2-4位

        //String不可变
        String s2 = "abcd";
        s2.toUpperCase();   //应该String s3 = s2.toUpperCase();
        System.out.println(s2);
    }
}
