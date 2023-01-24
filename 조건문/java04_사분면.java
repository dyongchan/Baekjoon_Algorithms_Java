package Baekjun._조건문;

import java.util.Scanner;

public class java04_사분면 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > 0 && B > 0) {
            System.out.print("1");
        } else if (A < 0 && B > 0) {
            System.out.print("2");
        } else if (A < 0 && B < 0) {
            System.out.print("3");
        } else if (A > 0 && B < 0) {
            System.out.print("4");
        }
    }
}
