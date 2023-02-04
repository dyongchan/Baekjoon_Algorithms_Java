package Baekjun._조건문;

import java.util.Scanner;

public class java01_두수비교 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String ineq = "";

        if (A > B) {
            ineq = ">";
        } else if (A < B) {
            ineq = "<";
        } else {
            ineq = "==";
        }
        System.out.print(ineq);
    }
}
