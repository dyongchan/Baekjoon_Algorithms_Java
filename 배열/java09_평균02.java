package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java09_평균02 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        double average = 0;
        int average_over_s = 0;
        double rate = 0;


        int test_case = scanner.nextInt();

        for (int i = 0; i < test_case; i++) {
            int student = scanner.nextInt();
            int[] arr = new int[student];
            total = 0;
            average = 0;
            average_over_s = 0;

            for (int j = 0; j < student; j++) {
                arr[j] = scanner.nextInt();
                total = total + arr[j];
            }
            average = total / student;

            for (int k = 0; k < student; k++) {
                if (arr[k] > average) {
                    average_over_s++;
                }
            }

            double result = (double) average_over_s * 100 / student;
            System.out.println(String.format("%.3f",result) + "%");
        }
    }
}
// 형변환 방식에 대한 이해도 필요
// Math.round : * 100 / 100.0 = 소수점 두번째자리까지 출력 및 0은 절삭
// String.format("%.3f,(입력)) = 소수점 세 번째자리 까지 출력하되, 0을 절삭하지 않는다.