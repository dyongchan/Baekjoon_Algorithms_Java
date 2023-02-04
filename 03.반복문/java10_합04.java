package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java10_합04 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

            while (true) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a==0 && b==0) {
                    System.out.print(" ");
                    break;
                }

                System.out.println(a+b);

                }
        }
}