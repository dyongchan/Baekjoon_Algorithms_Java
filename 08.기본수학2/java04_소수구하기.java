package Baekjun;

import java.util.Scanner;

public class java04_소수구하기 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int i = M;

        while (i<=N) {
            int cnt = 0;

            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2)
                System.out.println(i);

            i++;
        }
    }
}
// 에라토스테네스의 체로 풀기