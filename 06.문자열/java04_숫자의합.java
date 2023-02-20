package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java04_숫자의합 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;

        for (int i =0; i<N; i++) {
            String insert = scanner.next();
            Integer n = Integer.valueOf(insert);
            result = result + n;
        }
        System.out.print(result);
    }
}
