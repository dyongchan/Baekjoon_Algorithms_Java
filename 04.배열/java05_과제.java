package Baekjun.Baekjun_배열;

import java.util.Scanner;

public class java05_과제 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // 1  ~ 30번 까지 출석번호

        boolean[] array = new boolean[31];
        // 인덱스 당 기본 값이 False

        for (int i=0; i<28; i++) {
            int student = scanner.nextInt();
            array[student] = true;
        }

        for (int i=1; i<array.length; i++) {
            if(array[i] == false) {
                System.out.println(i);
            }
        }
    }
}

// 불린형의 배열 이용
// 28개의 입력이 들어올때, 없는값에 해당하는 false 값 출력