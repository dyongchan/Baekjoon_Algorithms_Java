package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java02_입력반복 {
    public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    int insert = scanner.nextInt();

    for (int i=0; i<insert; i++) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
    }
    }
}
