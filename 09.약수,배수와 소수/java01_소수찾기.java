package Baekjun.Baekjun_기본수학2;

import java.util.Scanner;

// 소수 = 1과 자기 자신만을 약자로 가지는 수
// 1 은 소수가 아니다.

public class java01_소수찾기 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;

        for (int i = 0; i<N; i++) {
            int insert = scanner.nextInt();
            int cnt = 0;

            for (int j = 1; j<=insert; j++) {
                if (insert % j == 0) {
                    cnt ++;
                }
                }
            if (cnt == 2) {
                result ++;
            }
        }
        System.out.println(result);
    }

}
