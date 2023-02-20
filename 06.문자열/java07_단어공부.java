package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java07_단어공부 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        String max_s = "";
        String result = "";

        String insert = scanner.next();

        String result_s = insert.toUpperCase();
        String[] arr = result_s.split("");

        for (int i =0; i<arr.length; i++) {
            int cnt = 0;
            for (int j=0; j<arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    cnt++;
                }
            }
            if(max <= cnt) {
                max = cnt;
                max_s = arr[i];
            }
            if (max == cnt) {
                result = max_s + arr[i];
            }
        }
        System.out.println(max_s);
        System.out.println(result);
    }
}
