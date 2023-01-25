package Baekjun.Baekjun_조건문;

import java.util.Scanner;

public class java06_오븐시계_재작성 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int Insert = scanner.nextInt();

        int Total =  H * 60 + M + Insert; // 세팅한 시간이 흐른 후의 총 시간
        int Present_H = Total / 60; // 흐른 후의 총 H
        int Present_M = Total % 60; // 흐룬 후의 총 M

        int Present_H_24 = Present_H % 24; // 24보다 작은 현재 시간

        if (Present_H > 23) {
            System.out.print(Present_H_24+" "+Present_M);
        } else {
            System.out.print(Present_H+" "+Present_M);
        }
    }
}
// 시간과 분을 총 분으로 환산
// 24로 나눈 나머지로 재환산
// if를 안써도 작성 가능하다.