package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java01_개수세기_재작성 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int compare = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == compare) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
