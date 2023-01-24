package Baekjun._조건문;

import java.util.Scanner;

public class java03_운년 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        if (((A%4 == 0) && (A%100 != 0)) || (A%400 == 0) ) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
