package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java03_합 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<n+1; i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
