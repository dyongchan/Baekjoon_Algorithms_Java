package Baekjun._조건문;

import java.util.Scanner;

public class java07_주사위 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = 10000 +(a*1000);
        int e = 1000 + (a*100);
        int f = 1000 + (b*100);
        int max1 = a * 100;
        int max2 = b * 100;
        int max3 = c * 100;

        int money = 0;

        if (a == b && b == c) {
            money = d;
        } else if ((a == b) && (b != c) && (a != c) || (a == c) && (a != b) && (c != b)) {
            money = e;
        } else if ((b == c) && (b != a) && (c != a)) {
            money = f;
        } else if ((c < b && b < a) || (b < c && c < a)) {
            money = max1;
        } else if ((a < c && c < b) || (c < a && a < b) ) {
            money = max2;
        } else if ((a < b && b < c) || (b < a && a < c) ) {
            money = max3;
        }
        System.out.print(money);
    }
}
