package Baekjun.Baekjun_기본수학1;

import java.util.Scanner;

public class java07_설탕배달 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int num = 0;

        if(N == 4 || N == 7 ) {
            System.out.print(-1);
        }
        else {
            if(N % 5 == 0) {
                System.out.print(N / 5);
            }
            else {
                if (N % 5 == 1)
                    num = 2;
                else if (N % 5 == 2)
                    num = 4;
                else if (N % 5 == 3)
                    num = 1;
                else if (N % 5 == 4)
                    num = 3;

                System.out.print(num + (N-(num*3))/5 );
            }
            // (N - 5로 나눈 나머지 * 3) / 5
        }
    }
}
/*      나머지가 1다 : 3개의 개수 2로 고정
        나머지가 2다 : 3의 개수 4로 고정
        나머지가 3이다 : 3의 개수가 1로 고정
        나머지가 4다 : 3의 개수 3으로 고정
        나머지가 0 : 5의 배수
        5의 개수는 2씩 증가"
*/





