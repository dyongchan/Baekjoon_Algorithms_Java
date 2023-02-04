package Baekjun._조건문;

import java.util.Scanner;

public class java02_시험성적 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        String grade = "";

        if (90 <= A && A <= 100) {
            grade = "A";
        } else if (80 <= A && A <= 89) {
            grade = "B";
        } else if (70 <= A && A <= 79) {
            grade = "C";
        } else if (60 <= A && A <= 69){
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.print(grade);
    }
}
