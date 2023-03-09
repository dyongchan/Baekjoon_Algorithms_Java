package Baekjun.Baekjun_재귀;

import java.util.Scanner;

public class java02_피보나치수5 {

    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.print(fib(N));

    }
}
