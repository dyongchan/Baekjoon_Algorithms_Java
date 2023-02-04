package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java07_합03 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<t+1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }
    }
}
