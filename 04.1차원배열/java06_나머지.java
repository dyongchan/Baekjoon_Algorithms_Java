package Baekjun.Baekjun_배열;

import java.util.*;

public class java06_나머지 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        int result = 0;

        for (int i=0; i<arr.length; i++) {
            int insert = scanner.nextInt();
            arr[i] = insert % 42; // arr 이라는 배열에 42로 나눈 나머지가 들어감
        }

        for (int i=0; i<arr.length; i++) { // 이중포문을 이용하여 중복체크
            int cnt = 0;
                for(int j=i+1; j<arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        cnt++;
                        }
                }
            if (cnt == 0) {
                result++;
            }
        }
        System.out.print(result);
    }
}
// 중복을 제거 한 후 배열의 길이를 출력 = 서로 다른값의 개수