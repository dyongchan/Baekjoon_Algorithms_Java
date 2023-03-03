package Baekjun.Baekjun_함수;

import java.util.Scanner;

// 1 ~ 9 = 수열의 길이가 1
// 10 ~ 99 = 각 자릿수가 2개 이므로 등차가 양수나 음수 1개이다 따라서 모두 등차수열
// 100 ~ 1000 : 각 자릿수에 대한 비교가 필요
// 100 까지의 모든 한수는 99개
public class java03_한수 {
    static int seq(int insert) {
        int cnt = 0;
        int[] arr = new int[3];


        if (insert >= 100) {

            for (int i = 100; i <= insert; i++) { // 배열에 각 자리수를 넣는다.
                    arr[0] = i % 10;
                    arr[1] = (i / 10) % 10;
                    arr[2] = i / 100;
            if ((arr[1] - arr[0]) == (arr[2] - arr[1])) {
                    cnt++;
                }
            }
            cnt = cnt + 99;

        } else {
            cnt = insert;
        }
        return cnt;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.print(seq(N));

    }
}
// 100을 기준으로 해당하는 숫자까지의 반복으로 배열에 넣어 등차를 구함
// 100미만의 수는 해당 수만 큼 등차수열을 갖기 때문에 바로 출력해준다.