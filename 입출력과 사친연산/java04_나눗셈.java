package Baekkjun.Baekkjun_입출력과사칙연산;

import java.util.Scanner;

public class java04_나눗셈 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double C = A/B;
        System.out.print(C);
    }
}