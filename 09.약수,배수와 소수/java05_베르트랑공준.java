package Baekjun.Baekjun_기본수학2;

import java.util.Scanner;

public class java05_베르트랑공준 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        boolean[] arr = new boolean[123456 * 2 + 1];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <Math.sqrt(arr.length); i++) {
            for (int j = i * i; j < arr.length; j = j + i) {
                arr[j] = true;
            }
        }

        while (true) {
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            int cnt = 0;
            for (int i = num + 1; i <= 2 * num; i++) {
                if (arr[i] == false) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
