package Baekjun.Baekjun_반복문;

import java.util.Scanner;

public class java09_별찍기02 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i=0; i<a; i++) {

            for (int k=a-1; i<k; k--) {
                System.out.print(" ");
            }

            for (int j=0; j <= i; j++) {
                    System.out.print("*");
                }
            System.out.println();
            }
    }
}
// for 문 속 2개의 for 문을 통해 역방향의 별 출력 = 별의 출력과 반대의 띄어쓰기 출력