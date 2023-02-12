package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java06_부녀회장 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int Test_Case_n = scanner.nextInt();

        int[][] arr = new int[15][15];

        for (int i=0; i<15; i++) {
            arr[0][i] = i;
            arr[i][1] = 1;
        }

        for (int i=0; i<Test_Case_n; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            for (int j = 1; j < 15; j++) {
                for (int s = 2; s < 15; s++) {
                    arr[j][s] = arr[j][s-1] + arr[j-1][s];
                }
            }
            System.out.println(arr[k][n]);
        }
    }
}
// 2차원 배열로 해당하는 인덱스를 생성
// 같은층의 호수-1 + 층-1 같은 호수의 로직으로 각 인덱스를 출력
