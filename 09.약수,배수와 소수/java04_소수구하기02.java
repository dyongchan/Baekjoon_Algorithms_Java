package Baekjun.Baekjun_기본수학2;

import java.util.Scanner;

public class java04_소수구하기02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean arr[] = new boolean[1000001];

        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<Math.sqrt(arr.length); i++) {
            for(int j= i*i; j<arr.length; j=j+i) {
                arr[j] = true;
            }
        }

        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i=M; i<=N; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }

    }

}
