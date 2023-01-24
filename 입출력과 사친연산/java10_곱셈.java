package Baekkjun.Baekkjun_입출력과사칙연산;

import java.util.Scanner;

public class java10_곱셈 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = b/100;
        int d = b%100;
        int e = d/10;
        int f = d%10;
        int g = f/1;

        System.out.println(a*c);
        System.out.println(a*e);
        System.out.println(a*c);
        System.out.println(a*b);
    }
}
