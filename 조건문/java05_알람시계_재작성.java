package Baekjun.Baekjun_조건문;

import java.util.Scanner;

public class java05_알람시계_재작성 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int left_m = 60 - (45 - M);

        if (M < 45 && H > 0) {
            System.out.print((H - 1)+" "+left_m);
        } else if (M < 45 && H <= 0) {
            H = 23;
            System.out.print(H+" "+left_m);
        } else {
            System.out.print(H+" "+(M - 45));
        }
    }
}
// 변수를 줄이고 변수명을 용도에 맞게 알아 보기 쉽게 변경
// 조건을 만족할때, 고정적인 값으로 초기화 하여 변수를 출력하게 변경
