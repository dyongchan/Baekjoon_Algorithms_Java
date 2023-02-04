package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java03_최소최대 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] array = new int[N];

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            int insert_integer = scanner.nextInt();
            array[i] = insert_integer;
            // array[i] = scanner.nextInt(); 축약가능
            if (array[i] <= min ) {
                min = array[i];
            }
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.print(min+" "+max);
    }
}

// 틀린부분을 찾기가 어렵다 20230128
// 문제를 잘 읽어보자 입력할 수 있는 주어진 최소, 최대값이 무엇인가?
// 조건식을 확실하게 나누어주기 = 테스트케이스에서 오류가 발생할 수 있다.