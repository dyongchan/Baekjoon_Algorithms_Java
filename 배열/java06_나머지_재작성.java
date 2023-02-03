package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java06_나머지_재작성 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;

        int result = 0;

        int[] arr = new int[10];

        for (int i=0; i<10; i++) {
            int number = scanner.nextInt();
            arr[i] = number % 42;
        }

        for (int i=0; i<arr.length; i++) {
            cnt = 0;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    }
                }
            if (cnt == 0) {
                result ++;
            }
        }
        System.out.print(result);
    }
}
