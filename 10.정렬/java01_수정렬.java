package Baekjun.Baekjun_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class java01_수정렬 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int insert = scanner.nextInt();
            arr[i] = insert;
        }
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
