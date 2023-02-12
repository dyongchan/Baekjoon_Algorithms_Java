package Baekjun.Baekjun_2차원배열;

import java.util.Scanner;

public class java01_행렬덧셈 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] arr3 = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int insert_M = scanner.nextInt();
                arr1[i][j] = insert_M;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int insert_M = scanner.nextInt();
                arr2[i][j] = insert_M;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
