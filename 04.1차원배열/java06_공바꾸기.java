package Baekjun.Baekjun_배열;

import java.util.Arrays;
import java.util.Scanner;

public class java06_공바꾸기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<M; i++) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            int num_1 = arr[j-1];
            int num_2 = arr[k-1];
            arr[k - 1] = num_1;
            arr[j - 1] = num_2;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }

        }
        System.out.print(sb);
    }
}
