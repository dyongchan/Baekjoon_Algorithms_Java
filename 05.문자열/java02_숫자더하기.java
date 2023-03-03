package Baekjun.Baekjun_문자열;

import java.util.Scanner;

public class java02_숫자더하기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;

        String insert = scanner.next();
        String[] arr = insert.split("");



        for (int i=0; i<N; i++) {
            Integer num = Integer.valueOf(arr[i]);
            result = result + num;
        }


        System.out.println(result);
    }
}
