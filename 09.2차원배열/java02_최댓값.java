package Baekjun.Baekjun_2차원배열;

import java.util.Scanner;

public class java02_최댓값 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int max_n1 = 0;
        int max_n2 = 0;

        for (int i =0; i<9; i++) {
            for (int j =0; j<9; j++) {
                arr[i][j] = scanner.nextInt();
            }
            for (int k =0; k<9; k++) {
                if (max <= arr[i][k]) {
                    max = arr[i][k];
                    max_n1 = i+1;
                    max_n2 = k+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_n1+" "+max_n2);
    }
}
