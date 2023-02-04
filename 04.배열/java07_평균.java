package Baekjun.Baekjun_배열;

import java.util.Scanner;
import java.util.Arrays;

public class java07_평균 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double[] arr = new double[N];

        double max = 0;
        double result = 0;

        for (int i=0; i<arr.length; i++) {
            double score = scanner.nextInt();
            arr[i] = score;

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i=0; i<arr.length; i++) {
            arr[i] = Math.round((arr[i]/max * 100) * 100) / 100.0;
            result = result + arr[i] / arr.length;
        }
        System.out.print(result);

    }
}
// 최댓값을 고른 후 모든점수/최댓값 * 100 으로 환산 후 평균 출력