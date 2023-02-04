package Baekjun._조건문;

import java.util.Scanner;

public class java03_운년 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        int decision = 0;

        if (((A%4 == 0) && (A%100 != 0)) || (A%400 == 0) ) {
            decision = 1;
        } else {
            decision = 0;
        }
        System.out.print(decision);
    }
}
