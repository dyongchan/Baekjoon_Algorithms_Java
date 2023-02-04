package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java01_구구단 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int b = a * i;
            System.out.println(a+" * "+i+" = "+b);

        }
    }
}
