package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

// 방번호 = YYX / YYXX
// H = 층 / W = 방의 길이 / N = 10번째 손님

public class java05_ACM호텔02 {

    public static int room_n(int Height,int Number) {
        int num = 0;
        int i = 0;

        while (true) {
            if (Number <= Height * i) {
                num = i;
                break;
            }
            i++;
        }
        return num;
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();

        for (int i = 0; i<test_case; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int result = 0;

            if (N % H == 0) {
                result = H * 100 + (room_n(H,N));
            } else {
                result = (N % H)*100 +(room_n(H,N));
            }

            System.out.println(result);
        }
    }
}
