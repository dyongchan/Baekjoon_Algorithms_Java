package Baekjun._조건문;

import java.util.Scanner;

public class java02_시험성적 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        if (90 <= A && A <= 100) {
            System.out.print("A");
        } else if (80 <= A && A <= 89) {
            System.out.print("B");
        } else if (70 <= A && A <= 79) {
            System.out.print("C");
        } else if (60 <= A && A <= 69){
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
