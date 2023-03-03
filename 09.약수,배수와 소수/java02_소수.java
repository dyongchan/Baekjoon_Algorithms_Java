package Baekjun.Baekjun_기본수학2;

import java.util.Scanner;


public class java02_소수 {

    public static int d(int n) {

        int num = 0;
        int cnt = 0;

        for(int i = 1; i<=n; i++) {
            if(n % i== 0) {
                cnt ++;
            }
        }
        if (cnt == 2) {
            num = n;
        }
        else {
            num = 0;
        }
        return num;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int min = 10000;
        int value = 0;

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        for(int i=M; i<=N; i++) {
               value = d(i);
               sum = sum + value;

               if(d(i) < min && d(i) != 0) {
                   min = d(i);
               }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        }
        else {
            System.out.print(-1);
        }
    }
}
