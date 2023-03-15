package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java00_문자와문자열 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int n = scanner.nextInt();

            System.out.print(str.charAt(n-1));

    }
}
