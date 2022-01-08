package basic;

public class Lesson_Break {
    public static void main(String[] args) {
        OUT:
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                if ((i * j) % 2 == 1) {
                    System.out.print(i * j);
                    break OUT;       //想要输出一个就退出，不能直接break，可以在循环前加label，再 break label
                }
            }
        }
    }
}
