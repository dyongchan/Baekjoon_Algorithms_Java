// 불기 = 서기 + 544 (그해기준 = 543)

package Baekkjun.Baekkjun_입출력과사칙연산;

import java.util.Scanner;

public class java07_연도변환 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = A - 543;

        System.out.print(B);
    }
}
