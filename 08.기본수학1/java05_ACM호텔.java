package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java05_ACM호텔 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t_c = scanner.nextInt();

        for (int i = 0; i<t_c; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            if(N % H == 0) { // 꼭대기층
                System.out.println((H*100) + (N / H));
            } else {
                System.out.println(((N % H)*100 + (N /H) +1));
            }
        }
    }
}
