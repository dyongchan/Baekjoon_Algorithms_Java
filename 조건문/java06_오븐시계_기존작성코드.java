package Baekjun._조건문;

import java.util.Scanner;

public class java06_오븐시계_기존작성코드 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int F = scanner.nextInt();

        int MF = M + F;
        int m1 = MF / 60;
        int m2 = MF % 60;

        int h1 = H + m1;
        int h2 = (H + m1) - 24;

        if (MF < 60) {
            System.out.print(H + " " + m2);
        } else if ((MF >= 60 && H == 23)) {
            System.out.print((m1-1) + " " + m2);
        } else if ((MF >= 60 && (H != 23)) && (H+m1) > 24) {
            System.out.print((h2) + " " + m2);
        } else if ((MF >= 60 && (H != 23)) && (H+m1) < 24){
            System.out.print((h1) + " " + m2);
        }
    }
}

// 어느부분에서 잘못되었는지 찾기가 힘듬 20230124
// 너무 어렵게 작성한 코드 = 20230125
