package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java06_합02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i=1; i<t+1; i++) {
            System.out.print("Case #"+i+": ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a+b);
        }
    }
}
