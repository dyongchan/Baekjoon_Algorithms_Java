package Baekjun.Baekjun_배열;

import java.util.Arrays;
import java.util.Scanner;

public class java05_공넣기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<M; i++) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            int s = scanner.nextInt();


            for(int a = j-1; a<=k-1; a++) {
             arr[a] = s;
            }
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
