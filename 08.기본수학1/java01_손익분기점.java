package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java01_손익분기점 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int total_Cost = 0;
        int i = 1;

        int A = scanner.nextInt(); // 고정비용
        int B = scanner.nextInt(); // 가변비용
        int C = scanner.nextInt(); // 판매가

        while (true) {
            if (B >= C) {
                System.out.print(-i);
                break;
            }

            total_Cost = A - ((C - B) * i);

            if ((C - B) == 1 ){
                System.out.print(A+1);
                break;
            }

            if (total_Cost < 0) {
                System.out.print(i);
                break;
            }
            i++;
        }
    }
}
