package Baekjun.Baekjun_재귀;

import java.util.Scanner;


// n! = 1 x 2 x ... n

public class java01_팩토리얼 {

    public static int fac(int a) { // 함수 내부에서 종료조건을 걸어준다.
        if (a <= 1) {
            return 1;
        }

        return a * fac(a-1);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.print(fac(N));
    }
}
