package Baekjun._조건문;

import java.util.Scanner;

public class java05_알람시계 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int m1 = M - 45;
        int m2 = 60 + m1;

        if (M < 45 && H != 0) {
            System.out.print((H - 1)+" "+m2);
        } else if (M < 45 && H == 0) {
            System.out.print(("23")+" "+m2);
        } else {
            System.out.print(H+" "+m1);
        }
    }
}
