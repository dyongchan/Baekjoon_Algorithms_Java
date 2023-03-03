package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java03_문자열 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        for(int i =0; i<test; i++) {
            String str = scanner.next();

            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length()-1));
            System.out.println();
        }
    }
}
