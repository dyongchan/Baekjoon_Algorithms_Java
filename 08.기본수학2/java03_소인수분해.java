package Baekjun.Baekjun_기본수학2;

import java.util.Scanner;

public class java03_소인수분해 {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double N_M = Math.sqrt(N);

        for (int i=2; i<=N_M; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}

// 소인수중 1개는 무조건 넣은수의 제곱근의 근사치보다 작거나 같다.
