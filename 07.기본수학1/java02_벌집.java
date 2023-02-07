package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java02_벌집 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int cnt = 1;
        int i =2;

        if (number == 1) {
            System.out.print(1);
        }
        else {
            while (i <= number){
                i = i + cnt*6;
                cnt ++;
            }
            System.out.print(cnt);
        }
    }
}