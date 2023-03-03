package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java03_분수찾기 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 1; // 대각선의 요소의 개수
        int sum = 0; // 내가 선택한 부분에 전 대각선의 요소개수 합들

        while (true) {
            if(number <= sum + count) {
                if(count % 2 == 0) {
                    System.out.print((number - sum) + "/" + (count - (number - sum - 1)));
                    break;
                }
                else {
                    System.out.print((count - (number - sum - 1)) + "/" + (number - sum));
                    break;
                }
            }
            sum = sum + count;
            count++;
        }
    }
}
